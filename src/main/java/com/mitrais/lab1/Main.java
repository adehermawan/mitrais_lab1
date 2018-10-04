package com.mitrais.lab1;

import com.mitrais.lab1.model.Cake;
import com.mitrais.lab1.model.OrderCake;
import com.mitrais.lab1.model.ReadyMadeCake;

public class Main {
	
    public static void main(String[] args) {
    	
    	double totalPriceOrderCake =0;
    	double totalPriceReadyMadeCake =0;
    	int totalQuantityReadyMadeCake=0;
    	double highestPrice = 0;
    	String cakeName ="";
    	int b;
    	
    	Cake[] cake = new Cake[20];
    	OrderCake[] orderCake = new OrderCake[20];
    	ReadyMadeCake[] readyMadeCake = new ReadyMadeCake[20];
    	
    	for (int i = 0; i < cake.length; i++) {
    		b = i+1;
			OrderCake oc = new OrderCake("Cake-"+i, b*200, b);
			orderCake[i]=oc;
			
			ReadyMadeCake rmc = new ReadyMadeCake("Cake-"+i, b*200, b);
			readyMadeCake[i]=rmc;
		}
    	
    	

    	for (int i = 0; i < cake.length; i++) {
			totalPriceOrderCake+=orderCake[i].calcPrice();
			totalPriceReadyMadeCake+=readyMadeCake[i].calcPrice();
			totalQuantityReadyMadeCake+=readyMadeCake[i].getQuantity();
			
			if (readyMadeCake[i].calcPrice() > highestPrice) {
				highestPrice = readyMadeCake[i].calcPrice();
				cakeName = readyMadeCake[i].toString();
			}

		}
    	
    	System.out.println("Total price for all types of cakes : "+(totalPriceOrderCake+totalPriceReadyMadeCake));
    	System.out.println("Total Price for ready made cakes : "+totalPriceReadyMadeCake);
    	System.out.println("Quantity sold for rady made cakes : "+totalQuantityReadyMadeCake);
    	System.out.println("Cake that has been sold for the highest price : "+cakeName);
    }
    

}
