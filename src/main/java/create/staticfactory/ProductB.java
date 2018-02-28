package create.staticfactory;

public class ProductB implements IProduct {
	public void method() {
		System.out.println("output from " + this.getClass().getSimpleName());
	}
}
