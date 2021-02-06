class Tanker extends Weapon{
 public void readyOrder(){
	getRaw();
	getShapeMaterial();
	prepare();
	deliver();
 }
 public void prepare(){
	System.out.println("Preparing Tanker");
 }
 public void deliver(){
	System.out.println("delivered Tanker");
 }
}