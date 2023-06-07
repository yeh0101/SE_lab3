package de.haw.hamburg.sel.ex_ecommerce;

import java.util.Iterator;
import java.util.ArrayList;

public class Product extends ProductComponent{
	ArrayList productComponents = new ArrayList();
	String name;
	String price;
  
	public Product(String name, String price) {
		this.name = name;
		this.price = price;
	}
 
	public void add(ProductComponent productComponent) {
		productComponents.add(productComponent);
	}
 
	public void remove(ProductComponent productComponent) {
		productComponents.remove(productComponent);
	}
 
	public ProductComponent getChild(int i) {
		return (ProductComponent)productComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String Price() {
		return price;
	}
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + Price());
		System.out.println("---------------------");
  
		Iterator iterator = productComponents.iterator();
		while (iterator.hasNext()) {
			ProductComponent productComponent = 
				(ProductComponent)iterator.next();
			productComponent.print();
		}
	}
}
