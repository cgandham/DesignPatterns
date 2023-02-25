package Factory;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Use shape factory to fetch created objects");
		System.out.println("shapeFactory return object of interface shape, that all shapes implement.");
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		System.out.println("Can also create object without using factory");
		Shape shape3 = new Circle();
		shape3.draw();
		
		System.out.println("Abstarct factory is a factory to fetch factories object.");
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory("Shape");
	    Shape shape4 = shapeFactory2.getShape("Circle");
	    shape4.draw();
	    
	    System.out.println('R' != 'S');

	}

}
