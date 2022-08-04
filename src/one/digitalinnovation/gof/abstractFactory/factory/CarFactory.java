package one.digitalinnovation.gof.abstractFactory.factory;

import one.digitalinnovation.gof.abstractFactory.model.car.Car;
import one.digitalinnovation.gof.abstractFactory.model.car.HatchBackCar;
import one.digitalinnovation.gof.abstractFactory.model.car.SedanCar;

public class CarFactory implements AbstractFactory<Car>{
	@Override
	public Car create(String type) {
		if("sedan".equalsIgnoreCase(type)) {
			return new SedanCar();
		}else if("hatchback".equalsIgnoreCase(type)) {
			return new HatchBackCar();
		}
		return null;
	}
}
