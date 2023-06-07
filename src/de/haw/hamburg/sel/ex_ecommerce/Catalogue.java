package de.haw.hamburg.sel.ex_ecommerce;


public class Catalogue {
	ProductComponent allProducts;
	 
	public Catalogue(ProductComponent allProducts) {
		this.allProducts = allProducts;
	}
 
	public void printCatalogue() {
		allProducts.print();
	}

}
