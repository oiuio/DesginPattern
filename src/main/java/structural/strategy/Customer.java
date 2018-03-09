package structural.strategy;

public class Customer {

	private Double totalAmount;

	private Double amount;

	private CalcPrice calcPrice;

	public Customer() {
		this.totalAmount = 0D;
		this.amount = 0D;
		this.calcPrice = new CommonCalc();
	}

	public void buy(Double amount) {
		this.amount = amount;
		totalAmount += amount;
		calcPrice = CalcPriceFactory.getInstance(this);
	}

	public Double getLastAmount() {
		return calcPrice.calcPrice(amount);
	}

	public Double getTotalAmount() {
		return totalAmount;
	}
}
