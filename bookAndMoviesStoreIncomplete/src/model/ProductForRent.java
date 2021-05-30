package model;

import java.time.LocalDate;

public class ProductForRent extends Product implements Rentable{
	
	//ATTRIBUTES	
	private LocalDate devolutionDate;
	
	//RELATIONS
	private State state;
	
	//CONSTRUCTOR
	public ProductForRent(String code, String name, int units, double price, ProductType type, LocalDate devolutionDate, State state) {
		
		super(code, name, 1, price, type);
		devolutionDate = LocalDate.of(2021, 05, 28);
		state = State.AVAILABLE;
		
	}
	
	//GETTERS AND SETTERS
//	public LocalDate getDevolutionDate() {
//		return devolutionDate;
//	}
//	
//	public void setDevolutionDate(LocalDate devolutionDate) {
//		this.devolutionDate = devolutionDate;
//	}
//
//	public State getState() {
//		return state;
//	}
//
//	public void setState(State state) {
//		this.state = state;
//	}

	//INHERITED ABSTRACT METHODS
	@Override
	public String getInformation() {
		
		return null;
	}
	
	@Override
	public boolean isSafeRent() {
		return false;
	}
	
	@Override
	public double getRentPrice(int rent) {
		return 0;
	}
	
	@Override
	public void rentProduct(int product) {
		
	}
	
	
}
