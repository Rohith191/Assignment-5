package com.icecreamcompany.week5;

public class MakePaymentState implements DeliveryOrderState {
	IceCreamOrder _order;
	public MakePaymentState(IceCreamOrder order) 
	{
		_order = order;
		
	}
	
	@Override
	public void goToNextStep() {
		_order.setState(new AssignDeliveryPersonState(_order));
	}

	@Override
	public void goToPreviousStep() {
		_order.setState(new MakeSelectionState(_order));
	}

	@Override
	public String getStep() {
		return "Make Payment";
	}

}
