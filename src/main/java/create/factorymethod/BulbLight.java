package create.factorymethod;

public class BulbLight implements Light {
	@Override
	public void turnOn() {
		System.out.println(this.getClass().getSimpleName() + " On");
	}

	@Override
	public void turnOff() {
		System.out.println(this.getClass().getSimpleName() + " Off");
	}
}
