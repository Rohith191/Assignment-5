package com.icecreamfactory.week5;

public class IdleMachineState implements VendingMachineState {
	private IceCreamVendingMachine machine;
	public IdleMachineState(IceCreamVendingMachine machine) {
		this.machine = machine;
	}
	@Override
	public void setFlavour(String flavour) {
		// TODO Auto-generated method stub
		System.out.println("You have selected "+flavour+" Ice Cream");
		machine.setState(new AcceptCashState(machine));
	}
	@Override
	public void acceptCash(Integer cash) {
		// TODO Auto-generated method stub
		System.out.println("Please select a flavour first");
	}
	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		System.out.println("Cannot cancel order at this point.");
	}
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Please select a flavour first");
	}
	
	@Override
	public void setError(String error)
	{
		
	}
	
	@Override
	public void ejectCash() {
		// TODO Auto-generated method stub
		
	}
}
