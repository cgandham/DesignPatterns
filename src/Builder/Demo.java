package Builder;

import Builder.Director.Director;
import Builder.builders.CarBuilder;
import Builder.builders.ToyCarBuilder;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Use a Directer to build");
		System.out.println("Pass your builder to director");
		
		
		Director director = new Director();
		
		System.out.println("carbuilder builds object of Car");
		CarBuilder carBuilder = new CarBuilder();
		director.constructCar(carBuilder);
		carBuilder.getResult();
		
	
		
		System.out.println("toyCarbuilder builds object of toyCar");
		ToyCarBuilder toyCarBuilder = new ToyCarBuilder();
		director.constructToyCar(toyCarBuilder);
		toyCarBuilder.getResult();
		
	
		
		
		

	}

}
