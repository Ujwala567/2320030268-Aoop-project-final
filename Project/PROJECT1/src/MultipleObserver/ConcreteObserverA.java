package MultipleObserver;

public class ConcreteObserverA {
private String name;
	public ConcreteObserverA(String name) {
		this.name=name;
	}
    public void update(String state) {
    	System.out.println(name +" recieved update :" +state);
    }
}
