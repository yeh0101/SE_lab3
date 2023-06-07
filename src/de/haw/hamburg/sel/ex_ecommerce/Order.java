package de.haw.hamburg.sel.ex_ecommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import de.haw.hamburg.sel.ex_ecommerce.Payment;

/**
 * Order class with payment method.
 */
public class Order {
	private int totalCost = 0;
	private boolean isOrderClosed = false;



	public void processOrder(Payment payment) {
		payment.collectPaymentDetails();
	}

	public void setTotalCost(int cost) {
		this.totalCost += cost;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public boolean isClosed() {
		return isOrderClosed;
	}

	public void setClosed() {
		isOrderClosed = true;
	}


}