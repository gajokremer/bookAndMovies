package model;

public interface Rentable {

	public boolean isSafeRent();
	
	public double getRentPrice(int rent);
	
	public void rentProduct(int product);
}
