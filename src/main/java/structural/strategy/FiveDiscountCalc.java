package structural.strategy;

@TotalValidRegin(min = 2000,max = 3000)
public class FiveDiscountCalc implements CalcPrice {
	@Override
	public double calcPrice(Double originalPrice) {
		return originalPrice * 0.5;
	}
}
