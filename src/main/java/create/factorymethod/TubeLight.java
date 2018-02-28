package create.factorymethod;

public class TubeLight implements Light {

	@Override
	public void turnOn() {
		System.out.println(this.getClass().getSimpleName() + " On");
	}

	@Override
	public void turnOff() {
		System.out.println(this.getClass().getSimpleName() + " Off");
	}
}
