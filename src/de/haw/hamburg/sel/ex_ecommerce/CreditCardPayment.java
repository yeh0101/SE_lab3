
package de.haw.hamburg.sel.ex_ecommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Dummy credit card class.
 */
public class CreditCardPayment implements Payment{
    private boolean cardIsValid;
    CreditCard creditCard;
    
    public void collectPaymentDetails() {
    	BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    	String number;
    	String date;
    	String cvv;
    	
    	try {
			System.out.print("Enter the card number: ");
		    number = READER.readLine();
		    System.out.print("Enter the date: ");
		    date = READER.readLine();
		    System.out.print("Enter the cvv: ");
		    cvv = READER.readLine();
		    creditCard = new CreditCard(number, date, cvv);
    	}
        catch (IOException ex) {
            ex.printStackTrace();
        }
 
    }
    
    /*
    private boolean verifyCredentials(String number, String ) {
		setValidCard(email.equals(CREDITCARD_DATA_BASE.get(password)));
		return signedInPaypal;
	}*/
    
	public boolean pay(int paymentAmount) {
		if (creditCard != null) {
			System.out.println("Paying " + paymentAmount + " using Credit Card.");
			return true;
		} else {
			return false;
		}
	}
}



