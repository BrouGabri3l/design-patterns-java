package one.digitalinnovation.gof.abstractFactory.factory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String type) {
		 if("car".equalsIgnoreCase(type)) {
			 return new CarFactory();
		 }
		 return null;
	}
}
	