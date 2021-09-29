package com.icecreamfactory.week5;

import java.util.HashMap;

public class IceCreamVendingMachine {
	HashMap<String, Integer> inventory;
	VendingMachineState state;
	String flavour;
	Integer cashInMachine;
	
	IceCreamVendingMachine(){
		resetInventory();
		state = new IdleMachineState(this);
	}
	
	public void setState(VendingMachineState state){
		this.state = state;
	}
	
	public String getFlavour()
	{
		return flavour;
	}
	public Integer getCashInMachine()
	{
		return cashInMachine;
	}
	
	public void selectIceCreamFlavour(String flavour)
	{
		if(state instanceof IdleMachineState) 
		{
			Integer count = inventory.get(flavour);
			if(count <= 0)
			{
				state = new ErrorState(this);
				state.setError("We are fresh out of "+flavour+" icecreams! Select something else!");
			}
			else
			{
				state.setFlavour(flavour);
				this.flavour = flavour;
			}
		}
		else 
		{
			System.out.println("Cannot select ice cream since state is not in idle");
		}
	}
	
	public void insertCash(Integer cash)
	{
		if(state instanceof AcceptCashState) 
		{
			state.acceptCash(cash);
			this.cashInMachine = cash;
		}
		else 
		{
			state = new ErrorState(this);
			state.setError("Cannot accept cash for ice cream since state is not in AcceptCashState");
		}
	}
	
	public void dispense() 
	{
		if(state instanceof DispenseIceCreamState) 
		{
			state.dispense();
			Integer count = inventory.get(this.flavour);
			count--;
			inventory.replace(this.flavour, count);
		}
		else 
		{
			state = new ErrorState(this);
			state.setError("Cannot dispense ice cream since state is not in DispenseIceCreamState");
		}
	}
	
	public void cancelOrder()
	{
		if(state instanceof DispenseIceCreamState)
		{
			System.out.println("Canceling Order...");
			state = new EjectCash(this);
			state.ejectCash();
		}
		else 
		{
			state = new ErrorState(this);
			state.setError("Cannot cancel order at this state");
		}
	}
	
	public void resetInventory() {
		inventory = new HashMap<String, Integer>();
		inventory.put("Vanilla", 5);
		inventory.put("Strawberry", 3);
	}

	public void setMachineInCash(int i) {
		cashInMachine = i;
	}
}
