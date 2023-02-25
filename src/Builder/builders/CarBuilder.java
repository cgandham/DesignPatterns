package Builder.builders;

import Builder.BuildTypes.Car;
import Builder.Components.Engine;

public class CarBuilder implements Builder {
	private int seats;
	private int doors;
	private Engine engine;

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setDoors(int Doors) {
		this.doors = doors;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	 public Car getResult() {
	     return new Car(doors, seats, engine);
	 }

}
