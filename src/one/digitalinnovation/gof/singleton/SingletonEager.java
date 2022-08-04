package one.digitalinnovation.gof.singleton;

public class SingletonEager {
	private static SingletonEager instance = new SingletonEager();
	private SingletonEager() {
		super();
	}
	public static SingletonEager getInstancia() {
		return instance;
	}
}
