package com.icecreamcompany.week5;

public class AssignDeliveryPersonState implements DeliveryOrderState {
	
	IceCreamOrder _order;
	
	public AssignDeliveryPersonState(IceCreamOrder order)
	{
		_order = order;
	}
	
	@Override
	public void goToNextStep() {
		_order.setState(new OrderDelivered(_order));
	}

	@Override
	public void goToPreviousStep() {
		_order.setState(new MakePaymentState(_order));
	}

	@Override
	public String getStep() {
		return "Assign Delivery Person";
	}

}
