import staticfactory.Creator;
import staticfactory.IProduct;

public class StaticFactoryDemo {
	public static void main(String[] args) {
		IProduct product = Creator.getInstance("producta");
		product.method();
	}
}
