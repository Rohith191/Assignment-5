package com.icecreamcompany.week5;


public class Main {

	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("Happy path forward only usecase:");
		System.out.println("============================================");
		var order = new IceCreamOrderProcess();
		order.startNewIceCreamOrderProcess();
		order.printStep();
		order.proceedToNextStep();
		order.printStep();
		order.proceedToNextStep();
		order.printStep();
		order.proceedToNextStep();
		order.printStep();
		order.proceedToNextStep();
		System.out.println("============================================");
		System.out.println("Forward with backward step usecase:");
		System.out.println("============================================");
		var order1 = new IceCreamOrderProcess();
		order1.startNewIceCreamOrderProcess();
		order1.printStep();
		order1.proceedToNextStep();
		order1.printStep();
		order1.proceedToNextStep();
		order1.printStep();
		order1.goBackToPreviousStep(); //back to previous step
		order1.printStep();
		order1.proceedToNextStep();
		order1.printStep();
		order1.proceedToNextStep();
		order1.printStep();
		order1.proceedToNextStep();
		System.out.println("============================================");
		System.out.println("Forward with order canceled step usecase:");
		System.out.println("============================================");
		var order2 = new IceCreamOrderProcess();
		order2.startNewIceCreamOrderProcess();
		order2.printStep();
		order2.proceedToNextStep();
		order2.printStep();
		order2.cancelOrder();
		order2.printStep();
	}

}
