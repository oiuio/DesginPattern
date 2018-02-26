import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.Shape;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape = shapeFactory.getShape("circle");
		shape.draw();
		shape = shapeFactory.getShape("square");
		shape.draw();


	}
}
