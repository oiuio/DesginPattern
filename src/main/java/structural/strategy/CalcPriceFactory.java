package structural.strategy;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CalcPriceFactory {

	private static final String CALC_PRICE_PACKAGE = "structural.strategy";

	private ClassLoader classLoader = getClass().getClassLoader();

	private List<Class<? extends CalcPrice>> calcPriceList;

	private CalcPriceFactory() {

	}

	public static CalcPrice getInstance(Customer customer) {
		if (customer.getTotalAmount() > 1000) {
			return new SevenDiscountCalc();
		} else if (customer.getTotalAmount() > 2000) {
			return new FiveDiscountCalc();
		} else if (customer.getTotalAmount() > 3000) {
			return new ThreeDiscountCalc();
		} else {
			return new CommonCalc();
		}
	}

	private void init() {
		calcPriceList = new ArrayList<>();
		File[] recources = getResources();
		Class<CalcPrice> calcPriceClazz = null;
		try {
			calcPriceClazz = (Class<CalcPrice>) classLoader.loadClass(CalcPrice.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	//获取所有策略文件
	private File[] getResources() {
		try {
			File file = new File(classLoader.getResource(CALC_PRICE_PACKAGE.replace(".", "/")).toURI());
			return file.listFiles(pathname -> pathname.getName().endsWith(".class"));

		} catch (URISyntaxException e) {
			throw new RuntimeException("未找到策略资源");
		}
	}


}
