package Builder.Director;

import Builder.Components.Engine;
import Builder.builders.Builder;

public class Director {
	
	public void constructCar(Builder builder) {
		builder.setDoors(2);
		builder.setSeats(2);
		builder.setEngine(new Engine(1, 2));
	}
	
	public void constructToyCar(Builder builder) {
		builder.setDoors(2);
		builder.setSeats(2);
		builder.setEngine(new Engine(1, 2));
	}

}
