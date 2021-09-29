package com.icecreamfactory.week5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCreamVendingMachine machine = new IceCreamVendingMachine();
		machine.selectIceCreamFlavour("Vanilla");
		machine.insertCash(5);
		machine.dispense();
		
		machine.selectIceCreamFlavour("Vanilla");
		machine.insertCash(5);
		machine.dispense();
		
		machine.selectIceCreamFlavour("Vanilla");
		machine.insertCash(5);
		machine.dispense();
		
		machine.selectIceCreamFlavour("Vanilla");
		machine.insertCash(5);
		machine.dispense();
		
		machine.selectIceCreamFlavour("Vanilla");
		machine.insertCash(5);
		machine.dispense();
		
		machine.selectIceCreamFlavour("Vanilla"); //should see error since machine ran out of vanilla after 5 dispenses
		
		
		machine.selectIceCreamFlavour("Strawberry");
		machine.insertCash(6);
		machine.dispense();

		machine.selectIceCreamFlavour("Strawberry");
		machine.insertCash(6);
		machine.dispense();
		
		machine.selectIceCreamFlavour("Strawberry");
		machine.insertCash(6);
		machine.dispense();
		
		machine.selectIceCreamFlavour("Strawberry"); //should see error since machine ran out of strawberry after 3 dispenses
		
		machine.resetInventory();
		
		machine.selectIceCreamFlavour("Strawberry");
		machine.insertCash(6);
		machine.cancelOrder();
		
		machine.selectIceCreamFlavour("Vanilla");
		machine.insertCash(5);
		machine.dispense();
	}

}
