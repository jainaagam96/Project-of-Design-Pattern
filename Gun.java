class Gun extends Weapon{
 public void readyOrder(){
	getRaw();
	getShapeMaterial();
	prepare();
	deliver();
 }
 public void deliver(){
	System.out.println("delivered Gun");
 }
 public void prepare(){
	System.out.println("Preparing Gun");
 }
}