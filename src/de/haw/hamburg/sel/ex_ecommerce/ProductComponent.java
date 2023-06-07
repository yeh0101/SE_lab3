package de.haw.hamburg.sel.ex_ecommerce;

public abstract class ProductComponent {
	public void printProduct() {
		throw new UnsupportedOperationException();
	};
	public void add(ProductComponent productComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(ProductComponent productComponent) {
		throw new UnsupportedOperationException();
	}
	public ProductComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
}
