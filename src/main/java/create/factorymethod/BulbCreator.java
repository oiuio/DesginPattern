package create.factorymethod;

public class BulbCreator implements Creator {
	@Override
	public Light createLight() {
		return new BulbLight();
	}
}
