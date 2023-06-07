package de.haw.hamburg.sel.ex_ecommerce;

import java.util.ArrayList;

public class CPUGroup extends ProductComponent{
	private String name;
	private String price;
	private ArrayList cpus = new ArrayList();
	
	public CPUGroup(String name, String price) {
		this.name = name;
		this.price = price;
	}
	
	public void printProduct() {
		System.out.println("This is the catalogue of CPU: ");
		cpus.forEach(cpu -> {
			System.out.println(name + " " + price + " €");
		});
		
	}
	
	public void add(ProductComponent productComponent) {
		cpus.add(productComponent);
	}

}
