package structural;

import structural.strategy.Customer;

public class StrategyDemo {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy(1000D);
		System.out.println(customer.getTotalAmount());
		System.out.println(customer.getLastAmount());

		customer.buy(3000D);
		System.out.println(customer.getTotalAmount());
		System.out.println(customer.getLastAmount());

		customer.buy(2000D);
		System.out.println(customer.getTotalAmount());
		System.out.println(customer.getLastAmount());

		customer.buy(3000D);
		System.out.println(customer.getTotalAmount());
		System.out.println(customer.getLastAmount());

	}
}
