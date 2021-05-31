package model;

public class ProductForSale extends Product implements Saleable {
	
	//ATTRIBUTES
	private double discount;
	
	//CONSTRUCTOR
	public ProductForSale(String code, String name, int units, double price, ProductType type) {
		
		super(code, name, units, price, type);
	}

	//GETTERS AND SETTERS
	public double getDiscount() {
		
		return discount;
	}
	
	public void setDiscount(double discount) {
		
		this.discount = discount;
	}
	
	
	//INHERITED ABSTRACT METHODS
	@Override
	public double getSalePrice(int units) {
		
		Double result = (units * price) - discount;
		
		return result;
	}

	@Override
	public boolean isSafeSale(int units) {
		
		boolean result = false;
		
		if(units > 0) {
			
			result = true;
		}
		
		return result;
	}
	
	@Override	
	public double applyExtraDiscount(double subtotal, double percentageDiscount) {
		
//		double result = subtotal - percentageDiscount;
		
		double result;
		
		double discount = subtotal * percentageDiscount;
		
		result = subtotal - discount;
		
		return result;
	}
	
	@Override
	public double calculateTax(double totalPrice, double percentage) {
		
		double result = totalPrice + percentage;
		
		return result;
	}

	@Override
	public String getInformation() {
		
		String info = 
			"\nCode: " + getCode() + 
			"\nName: " + getName() + 
			"\nUnits: " + getUnits() + 
			"\nPrice: " + getPrice() + 
			"\nType: " + getType();
		
		return info;
	}
}
