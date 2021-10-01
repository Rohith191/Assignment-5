package com.icecreamcompany.week5;

public class IceCreamOrder {
	public DeliveryOrderState orderState;
	public IceCreamOrder()
	{
		orderState = new MakeSelectionState(this);
	}
	
	public void goToNextStep()
	{
		orderState.goToNextStep();
	}
	
	public void goToPreviousStep()
	{
		orderState.goToPreviousStep();
	}
	
	public void printStep()
	{
		System.out.println("Current Step is "+orderState.getStep());
	}

	public void setState(DeliveryOrderState orderState) {
		this.orderState = orderState;
	}
}
