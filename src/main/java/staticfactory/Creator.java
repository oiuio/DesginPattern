package staticfactory;

public class Creator {

	private static final String PRODUCT_A = "PRODUCTA";
	private static final String PRODUCT_B = "PRODUCTB";

	public static IProduct getInstance(String productName) {
		switch (productName.toUpperCase()) {
			case PRODUCT_A:
				return new ProductA();
			case PRODUCT_B:
				return new ProductB();
			default:
				throw new RuntimeException("not found");
		}
	}


}
