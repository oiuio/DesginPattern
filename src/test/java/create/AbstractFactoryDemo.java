package create;

import create.abstractfactory.AbstractFactory;
import create.abstractfactory.FactoryProducer;
import create.abstractfactory.Shape;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape = shapeFactory.getShape("circle");
		shape.draw();
		shape = shapeFactory.getShape("square");
		shape.draw();


	}
}
