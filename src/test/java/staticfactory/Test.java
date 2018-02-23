package staticfactory;

public class Test {
	public static void main(String[] args) {
		IProduct product = Creator.getInstance("producta");
		product.method();
	}
}
