package Designpattern;

public class SingletonLoggerDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("This is the first log message");
		logger.log("This is the second log message");
		Logger anotherLogger = Logger.getInstance();
		anotherLogger.log("This is the third log message");
		if(logger == anotherLogger) {
			System.out.println("Both logger references point to the same instance");
		}
		else {
			System.out.println("Differnt instances exist,Singleton pattern not working correctly");
		}

	}

}
