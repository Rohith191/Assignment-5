package com.icecreamcompany.week5;


public class Main {

	public static void main(String[] args) {
		System.out.println("Happy path forward only usecase:");
		var order = new IceCreamOrder();
		order.printStep();
		order.goToNextStep();
		order.printStep();
		order.goToNextStep();
		order.printStep();
		order.goToNextStep();
		order.printStep();
		order.goToNextStep();
		
		System.out.println("Forward with backward step usecase:");
		var order1 = new IceCreamOrder();
		order1.printStep();
		order1.goToNextStep();
		order1.printStep();
		order1.goToNextStep();
		order1.printStep();
		order1.goToPreviousStep(); //back to previous step
		order1.printStep();
		order1.goToNextStep();
		order1.printStep();
		order1.goToNextStep();
		order1.printStep();
		order1.goToNextStep();
	}

}
