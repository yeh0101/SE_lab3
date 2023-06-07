package de.haw.hamburg.sel.ex_ecommerce;
import java.util.ArrayList;

public class MotherBoardGroup extends ProductComponent{
	private String name;
	private String price;
	private ArrayList motherBoards = new ArrayList();
	
	public MotherBoardGroup(String name, String price) {
		this.name = name;
		this.price = price;
	}
	
	public void printProduct() {
		System.out.println("This is the catalogue of MotherBoard: ");
		motherBoards.forEach(motherBoard -> {
			System.out.println(name + " " + price + " €");
		});
		
	}
	
	public void add(ProductComponent motherboard) {
		motherBoards.add(motherboard);
	}
}
