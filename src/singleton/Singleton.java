package singleton;


public class Singleton {
	private Singleton singleton = new Singleton();
	private Singleton() {
	}

	public Singleton getInstance() {
		return singleton;
	}

}
