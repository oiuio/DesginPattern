package structural.strategy;

@TotalValidRegin(min = 3000)
public class ThreeDiscountCalc implements CalcPrice {
	@Override
	public double calcPrice(Double originalPrice) {
		return originalPrice * 0.3;
	}
}
