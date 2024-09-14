package MultipleObserver;

public class Main15 {

	public static void main(String[] args) {
		 Observable observable=new Observable();
	        ConcreteObserverA observerA=new ConcreteObserverA(null);
	        ConcreteObserverB observerB=new ConcreteObserverB(null);
	        observable.addObserver(observerA);
	        observable.addObserver(observerB);
	        observable.setState("State 1");
	        observable.removeObserver(observerA);
	        observable.setState("State 2");
	}
	}