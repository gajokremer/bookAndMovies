package model;

import java.time.LocalDate;

public class ProductForRent extends Product implements Rentable{
	
	//ATTRIBUTES	
	private LocalDate devolutionDate;
	
	//RELATIONS
	private State state;
	
//	CONSTRUCTOR
	public ProductForRent(String code, String name, double price, ProductType type) {
		
		super(code, name, 1, price, type);
		state = State.AVAILABLE;
		devolutionDate = LocalDate.of(2021, 05, 8);
	}
	
	//GETTERS AND SETTERS
	public LocalDate getDevolutionDate() {
		return devolutionDate;
	}
	
	public void setDevolutionDate(LocalDate devolutionDate) {
		this.devolutionDate = devolutionDate;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	//INHERITED ABSTRACT METHODS
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
	
	@Override
	public boolean isSafeRent() {
		
		boolean result = false;
		
		if(state == State.AVAILABLE) {
			
			result = true;
		}
		
		return result;
	}
	
	@Override
	public double getRentPrice(int amountDays) {
		
		double result = price * amountDays;
		
		return result;
	}
	
	@Override
	public void rentProduct(int amountDays) {
		
		setState(State.RENTED);
		setDevolutionDate(LocalDate.of(2021, 05, 8));
	}
	
	
}
