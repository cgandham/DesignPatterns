package Factory;

public class ShapeFactory extends AbstractFactory {
    
	Shape getShape(String shapeType) {
		switch(shapeType) {
		  case "Circle":
			  return new Circle();
		  case "Rectangle":
			  return new Rectangle();
		  default:
			  return null;
		
		}
	}
	
	Color getColor(String color) {
		return null;
	}

}
