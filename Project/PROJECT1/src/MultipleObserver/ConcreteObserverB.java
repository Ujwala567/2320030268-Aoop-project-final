package MultipleObserver;

public class ConcreteObserverB {
private String name;
	public ConcreteObserverB(String name) {
		this.name=name;
		
	}
	public void update(String state) {
		System.out.println(name+"recived update: "+state);
		
	}

}
