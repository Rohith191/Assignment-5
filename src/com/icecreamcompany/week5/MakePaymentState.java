package com.icecreamcompany.week5;

public class MakePaymentState implements DeliveryOrderState {
	IceCreamOrderProcess _order;
	public MakePaymentState(IceCreamOrderProcess order) 
	{
		_order = order;
		
	}
	
	@Override
	public void proceedToNextStep() {
		_order.setState(new AssignDeliveryPersonState(_order));
	}

	@Override
	public void goBackToPreviousStep() {
		_order.setState(new MakeSelectionState(_order));
	}

	@Override
	public String getStep() {
		return "Make Payment";
	}

	@Override
	public void cancelOrder() {
		_order.setState(new OrderCancelledState(_order));
	}
}
