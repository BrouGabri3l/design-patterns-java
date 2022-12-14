package one.digitalinnovation.gof;

import one.digitalinnovation.gof.abstractFactory.factory.AbstractFactory;
import one.digitalinnovation.gof.abstractFactory.factory.CarFactory;
import one.digitalinnovation.gof.abstractFactory.factory.FactoryProvider;
import one.digitalinnovation.gof.abstractFactory.model.car.Car;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
	public static void main(String[]args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		
		Facade facade = new Facade();
		facade.migrarClient("gabriel", "14460-000");
		
		AbstractFactory abstractFactory;
		abstractFactory = FactoryProvider.getFactory("Car");
		System.out.println(abstractFactory);
		Car sedanCar = (Car)abstractFactory.create("sedan");
		Car hatchCar = (Car)abstractFactory.create("hatchBack");
		sedanCar.print();
		hatchCar.print();
		System.out.println(sedanCar);
		
		
	}
}
