package com.icecreamfactory.week5;

public class ErrorState implements VendingMachineState {
	IceCreamVendingMachine machine;
	public ErrorState(IceCreamVendingMachine machine) {
		this.machine = machine;
	}
	@Override
	public void setFlavour(String flavour) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptCash(Integer cash) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setError(String error)
	{
		System.out.println("Oops! "+error);	
		this.machine.setState(new IdleMachineState(this.machine));
	}
	
	@Override
	public void ejectCash() {
		// TODO Auto-generated method stub
		
	}
}
