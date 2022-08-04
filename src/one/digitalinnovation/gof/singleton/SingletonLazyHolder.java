package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {
	private static class Holder{
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return Holder.instance;
	}
}
