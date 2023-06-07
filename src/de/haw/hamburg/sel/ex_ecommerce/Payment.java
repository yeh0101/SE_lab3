package de.haw.hamburg.sel.ex_ecommerce;

public interface Payment {
	boolean pay(int paymentAmount);
	void collectPaymentDetails();
}
