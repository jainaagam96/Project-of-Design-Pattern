import java.util.*;
class UNdefence{
 public UNcountry c;
 public void newOrder(){
        notifyObservers();
 }
 private final List<UNcountry> observers;
 public UNdefence(){
 observers=new ArrayList<>();
 }
 public UNcountry factory(String args){
	if(args.equals("India"))
	{
		return India.getInstance();
	}
	else if(args.equals("Australia"))
	{
		return Australia.getInstance();
	}
	else
	{
		return null;
	}
 }
 public void addObserver(UNcountry obs) {
    observers.add(obs);
  }
 public void notifyObservers() {
    for (var obs : observers) {
      obs.update();
    }
  }

}