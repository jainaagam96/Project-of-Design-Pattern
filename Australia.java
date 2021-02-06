public class Australia implements UNcountry {
  private static Australia uniqueInstance=new Australia ( );
  private Australia ( ){ }
  public static Australia getInstance( ){
    return uniqueInstance;
  }
  public void update(){
    System.out.println("New Order message to Australia");
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
    System.out.println("Australia");
  }
}

