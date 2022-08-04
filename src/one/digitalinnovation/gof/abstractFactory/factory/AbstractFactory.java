package one.digitalinnovation.gof.abstractFactory.factory;

public interface AbstractFactory<T> {
	T create(String type);
}
