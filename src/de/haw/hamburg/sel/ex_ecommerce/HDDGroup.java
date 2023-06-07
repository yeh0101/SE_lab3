package de.haw.hamburg.sel.ex_ecommerce;

import java.util.ArrayList;

public class HDDGroup extends ProductComponent{
	private String name;
	private String price;
	private ArrayList hdds = new ArrayList();
	
	public HDDGroup(String name, String price) {
		this.name = name;
		this.price = price;
	}
	
	public void printProduct() {
		System.out.println("This is the catalogue of CPU: ");
		hdds.forEach(hdd -> {
			System.out.println(name + " " + price + " €");
		});
		
	}
	
	public void add(ProductComponent productComponent) {
		hdds.add(productComponent);
	}

}
