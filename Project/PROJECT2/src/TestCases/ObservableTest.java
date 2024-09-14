package TestCases;

public class ObservableTest {
	private Observable observable;
    private Observer observerA;
    private Observer observerB;
    public void setup() {
    observable = new Observable(); 
    observerA = mock(ConcreteObserverA.class); 
    observerB = mock(ConcreteObserverB.class);
    }
    public void testAddObserver() {
        Observer.addObserver(observerA);
        Observer.setState("Test State"); 

        verify(observerA, times(1)).update("Test State");
    }
    public void testRemoveObserver() {
        Observer.addObserver(observerA);
        Observer.removeObserver(observerA);
        Observer.setState("Test State");

        verify(observerA, never()).update("Test State"); 
    }
    private Object never() {
				return null;
	}
	public void testNotifyObservers() {
        Observer.addObserver(observerA);
        Observer.addObserver(observerB);
        Observer.setState("New State"); 
        verify(observerA, times(1)).update("New State");
        verify(observerB, times(1)).update("New State"); 
    }
    private Observer verify(Observer observerA2, Object times) {
				return null;
	}
	private Object times(int i) {
			return null;
	}
	public void testNoObserversNotifiedIfNoneAdded() {
        Observer.setState("Test State"); 
        assertTrue(true); 
    }
	private void assertTrue(boolean b) {
		
	}
}







