package com.icecreamfactory.week5;

public class DispenseIceCreamState  implements VendingMachineState {
	private IceCreamVendingMachine machine;
	public DispenseIceCreamState(IceCreamVendingMachine machine) {
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
		
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Dispensing Ice Cream");
		this.machine.setState(new IdleMachineState(this.machine));
	}
	public void setError(String error)
	{
		
	}

	@Override
	public void ejectCash() {
		// TODO Auto-generated method stub
		this.machine.setState(new EjectCash(this.machine));
	}
}
