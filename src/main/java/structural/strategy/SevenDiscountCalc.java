package structural.strategy;

@TotalValidRegin(min = 1000,max = 2000)
public class SevenDiscountCalc implements CalcPrice {
	@Override
	public double calcPrice(Double originalPrice) {
		return originalPrice * 0.7;
	}
}
