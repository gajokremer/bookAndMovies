package model;

public interface Saleable {

	public double getSalePrice(int salePrice);
	
	public boolean isSafeSale(int option);
	
	public double applyExtraDiscount(double price, double discount);
	
	public double calculateTax(double price, double tax);
}
