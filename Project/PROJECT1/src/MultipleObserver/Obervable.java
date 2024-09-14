package MultipleObserver;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;
public class Obervable {
	private List<Observer> observers = new ArrayList<>();
	private String state;
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	public void notifyObservers() {
		for(Observer observer :  observers) {
			observer.update(state);
		}
	}
	 public void setState(String state) {
	        this.state = state;
	        notifyObservers();
	}
	public String getState() {
		return state;
	}

}
