package de.haw.hamburg.sel.ex_ecommerce;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import de.haw.hamburg.sel.ex_ecommerce.Order;
import de.haw.hamburg.sel.ex_ecommerce.Payment;
import de.haw.hamburg.sel.ex_ecommerce.Paypal;
import de.haw.hamburg.sel.ex_ecommerce.CreditCard;

/**
 * World first console e-commerce application.
 */
public class Demo {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static Payment payment;


    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            
         // Task 1.2
            // User can choose to list all products or a specific product group from a menu
            String ContinueSee;
            do {
            	System.out.print("Do you wish to see all products or specific product group? A/S: ");
            	if(reader.readLine() == "A") {
            		// print all
            	}else {
                    System.out.print("Please, select a product group:" + "\n" +
                            "1 - Mother board group" + "\n" +
                            "2 - CPU group" + "\n" +
                            "3 - HDD group" + "\n");
                   
                    int choice = Integer.parseInt(reader.readLine());
                    switch(choice) {
                    case '1':
                    	//print motherboard
                
                    case '2':
                    	System.out.print("Please, select a subgroup:" + "\n" +
                                "1 - Intel" + "\n" +
                                "2 - AMD" + "\n");
                        int choice_2 = Integer.parseInt(reader.readLine());
                        if(choice_2 == 1) {
                        	//print Intel
                        }else {
                        	//print AMD
                        }
             
                    	
                    case '3':
                    	System.out.print("Please, select a subgroup:" + "\n" +
                                "1 - PC" + "\n" +
                                "2 - Laptop" + "\n");
                    	int choice_3 = Integer.parseInt(reader.readLine());
                        if(choice_3 == 1) {
                        	//print PC
                        }else {
                        	//print Laptop
                        }
                   
                    }
            		
            	}
//////////////////////////////////////////////////////////////////////////////////////
                
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                ContinueSee = reader.readLine();
            } while (ContinueSee.equalsIgnoreCase("Y"));

            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                

                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

			if (payment == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PayPal" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    payment = new Paypal();
                } else {
                    payment = new CreditCardPayment();
                }
            }
            // Order object gathers payment data
            order.processOrder(payment);

            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
            	// Handle payment with Paypal
            	if (payment.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
        System.out.print("Thank you. Goodbye!");
    }
}