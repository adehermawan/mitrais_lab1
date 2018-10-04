package com.mitrais.lab1.model;

public class OrderCake extends Cake{
	private int weight;

	
	public OrderCake(String name, double rate, int weight) {
		super(name, rate);
		this.weight = weight;

	}

	@Override
	public double calcPrice() {
		return rate*weight;
	}
	

	
	

}
