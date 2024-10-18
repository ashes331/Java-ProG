package cls06;

public class Singleton {
	
	private static Singleton singletone = new Singleton();
		
		private Singleton() {
			
		}
		
		static Singleton getInstance() {
			return singletone;
		}

}
