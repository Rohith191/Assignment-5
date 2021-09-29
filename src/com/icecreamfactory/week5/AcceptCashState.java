package com.icecreamfactory.week5;

public class AcceptCashState implements VendingMachineState {
	private IceCreamVendingMachine machine;
	public AcceptCashState(IceCreamVendingMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}

	@Override
	public void setFlavour(String flavour) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptCash(Integer cash) {
		// TODO Auto-generated method stub
		System.out.println("Accepting Cash "+cash);
		this.machine.setState(new DispenseIceCreamState(this.machine));
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}
	
	public void setError(String error)
	{
		System.out.println("Oops! "+error);
	}

	@Override
	public void ejectCash() {
		// TODO Auto-generated method stub
		
	}
}
