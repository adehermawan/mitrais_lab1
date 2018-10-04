package com.mitrais.lab1.model;

public class ReadyMadeCake extends Cake{
	private int quantity;
	
	public ReadyMadeCake(String name, double rate, int qt) {
		super(name, rate);
		this.quantity = qt;
		
	}

	@Override
	public double calcPrice() {
		return rate*quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	

}
