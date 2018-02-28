package create.staticfactory;

public class ProductA implements IProduct {
	public void method() {
		System.out.println("output from " + this.getClass().getSimpleName());
	}
}
