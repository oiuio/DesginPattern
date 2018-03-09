package structural.strategy;

@TotalValidRegin(max = 1000)
public class CommonCalc implements CalcPrice {
	@Override
	public double calcPrice(Double originalPrice) {
		return originalPrice;
	}
}
