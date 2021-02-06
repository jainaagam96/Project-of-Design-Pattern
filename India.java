public class India implements UNcountry{
  private static India uniqueInstance=new India( );
  private India( ){ }
  public static India getInstance( ){
  return uniqueInstance;
  }
  public void update(){
    System.out.println("New Order message to India");
    }
  public void getOrder(String s){
    if (s.equals("Gun"))
    {
       Gun w=new Gun();
       w.readyOrder();
    }
    else if (s.equals("Tanker"))
    {
       Tanker w=new Tanker();
       w.readyOrder();
    }
    else{
      System.out.println("Not Found");
    }
  }
  public void displayName() {
    System.out.println("India");
  }
}

