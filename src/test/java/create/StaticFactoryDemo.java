package create;

import create.staticfactory.Creator;
import create.staticfactory.IProduct;

public class StaticFactoryDemo {
	public static void main(String[] args) {
		IProduct product = Creator.getInstance("producta");
		product.method();
	}
}
