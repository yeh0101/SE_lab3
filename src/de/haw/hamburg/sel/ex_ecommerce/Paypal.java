package de.haw.hamburg.sel.ex_ecommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Paypal implements Payment{
    private int amount;
    private String email;
    private String password;
    private boolean signedInPaypal;
	private static final Map<String, String> PAYPAL_DATA_BASE = new HashMap<>();

	static {
		PAYPAL_DATA_BASE.put("Passw0rd", "studi@haw.de");
		PAYPAL_DATA_BASE.put("qwertz", "prof@haw.de");
	}

	/*
    Paypal(String number, String date, String email, String password) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.email = email;
        this.password = password;
    }*/

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void collectPaymentDetails() {
    	BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    	String email;
    	String password;
        
    	try {
			while (!signedInPaypal) {
                System.out.print("Enter the user's email for Playpal: ");
                email = READER.readLine();
                System.out.print("Enter the password: ");
                password = READER.readLine();
                if (verifyPlaypalCredentials(email, password)) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
	private boolean verifyPlaypalCredentials(String email, String password) {
		setSignedIn(email.equals(PAYPAL_DATA_BASE.get(password)));
		return signedInPaypal;
	}

	public boolean pay(int paymentAmount) {
		if (signedInPaypal) {
			System.out.println("Paying " + paymentAmount + " using PayPal.");
			return true;
		} else {
			return false;
		}
	}

	private void setSignedIn(boolean signedIn) {
		this.signedInPaypal = signedIn;
	}
}
