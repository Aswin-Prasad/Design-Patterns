package Day1.Factory;

interface Vehicle {
	public void drive();
}

class Car implements Vehicle {
	public void drive() {
		System.out.println("Car is Moving...!");
	}
}

class Bike implements Vehicle {
	public void drive() {
		System.out.println("Bike is Moving...!");
	}
}

class Bus implements Vehicle {
	public void drive() {
		System.out.println("Bus is Moving...!");
	}
}

class VehicleFactory {
	public static Vehicle buildVehicle(String type) {
		switch(type) {
			case "Car":
				return new Car();
			case "Bike":
				return new Bike();
			case "Bus":
				return new Bus();
		}
		return null;
	}
}

public class FactorySolution {
	public static void main(String args[]) {
		Vehicle car = VehicleFactory.buildVehicle("Car");
		Vehicle bike = VehicleFactory.buildVehicle("Bike");
		Vehicle bus = VehicleFactory.buildVehicle("Bus");

		car.drive();
		bike.drive();
		bus.drive();
	}
}