package Builder.BuildTypes;

import Builder.Components.Engine;

public class ToyCar {
	private int seats;
	private int doors;
	private Engine engine;
	
	public ToyCar(int doors, int seats, Engine engine) {
		this.doors = doors;
		this.seats = seats;
		this.engine = engine;
		System.out.println("Created Toy Car -> "+ " Doors: "+this.doors+ " Seats: "+this.seats+ " ENGINE:" +this.engine.toString());
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

}
