package Builder.builders;

import Builder.BuildTypes.Car;
import Builder.BuildTypes.ToyCar;
import Builder.Components.Engine;

public class ToyCarBuilder implements Builder {
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
	
	public ToyCar getResult() {
	     return new ToyCar(doors, seats, engine);
	 }
	
}
