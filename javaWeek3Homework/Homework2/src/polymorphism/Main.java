package polymorphism;

public class Main {

	public static void main(String[] args) {
		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new
		 * EmailLogger(),new ConsoleLogger()};
		 * 
		 * for(BaseLogger logger:loggers) { logger.log("log mesaj�"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add(); 

	}

}
