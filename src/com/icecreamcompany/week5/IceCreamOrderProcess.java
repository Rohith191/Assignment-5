package com.icecreamcompany.week5;

public class IceCreamOrderProcess {
	public DeliveryOrderState orderState;
	public IceCreamOrderProcess()
	{
	}
	public void startNewIceCreamOrderProcess()
	{
		orderState = new MakeSelectionState(this);
	}
	
	public void proceedToNextStep()
	{
		orderState.proceedToNextStep();
	}
	
	public void goBackToPreviousStep()
	{
		orderState.goBackToPreviousStep();
	}
	
	public void printStep()
	{
		System.out.println("Current Step is "+orderState.getStep());
	}
	
	public void cancelOrder()
	{
		orderState.cancelOrder();
	}

	public void setState(DeliveryOrderState orderState) {
		this.orderState = orderState;
	}
}
