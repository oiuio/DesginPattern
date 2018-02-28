package create;

import create.factorymethod.*;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		Creator creator = new BulbCreator();
		Light light = creator.createLight();
		light.turnOn();
		light.turnOff();
		creator = new TubeCreator();
		light = creator.createLight();
		light.turnOn();
		light.turnOff();
	}
}
