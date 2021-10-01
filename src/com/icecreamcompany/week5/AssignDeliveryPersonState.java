package com.icecreamcompany.week5;

public class AssignDeliveryPersonState implements DeliveryOrderState {
	
	IceCreamOrderProcess _order;
	
	public AssignDeliveryPersonState(IceCreamOrderProcess order)
	{
		_order = order;
	}
	
	@Override
	public void proceedToNextStep() {
		_order.setState(new OrderDelivered(_order));
	}

	@Override
	public void goBackToPreviousStep() {
		_order.setState(new MakePaymentState(_order));
	}

	@Override
	public String getStep() {
		return "Assign Delivery Person";
	}

	@Override
	public void cancelOrder() {
		_order.setState(new OrderCancelledState(_order));
	}

}
