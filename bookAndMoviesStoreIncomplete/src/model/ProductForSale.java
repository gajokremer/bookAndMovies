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
	public double getSalePrice(int salePrice) {
		return 0;
	}

	@Override
	public boolean isSafeSale(int option) {
		return false;
	}

	@Override
	public double applyExtraDiscount(double price, double discount) {
		return 0;
	}

	@Override
	public double calculateTax(double price, double tax) {
		return 0;
	}

	@Override
	public String getInformation() {
		return null;
	}

}
