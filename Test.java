class Test extends Exception{
 public static void main(String[] args){
	try{
	   UNdefence df=new UNdefence();
           df.addObserver(India.getInstance());
           df.addObserver(Australia.getInstance());
           df.newOrder();
           System.out.println("Order to: "+args[0]);
	   df.factory(args[0]).getOrder(args[1]);
           
       }
       catch (Exception e){
	System.out.println("Error");
       }
 }
}