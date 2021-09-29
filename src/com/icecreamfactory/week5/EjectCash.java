package com.icecreamfactory.week5;

public class EjectCash implements VendingMachineState {

	IceCreamVendingMachine machine;
	public EjectCash(IceCreamVendingMachine machine)
	{
		this.machine = machine;
		ejectCash();
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
	public void setError(String error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectCash() {
		// TODO Auto-generated method stub
		System.out.println("Ejecting Cash...$"+machine.getCashInMachine());
		this.machine.setMachineInCash(0);
		System.out.println("Order Canceled");
		this.machine.setState(new IdleMachineState(this.machine));
	}

}
