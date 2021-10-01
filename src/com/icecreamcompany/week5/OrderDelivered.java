package com.icecreamcompany.week5;

public class OrderDelivered implements DeliveryOrderState {
	
	IceCreamOrder _order;
	
	public OrderDelivered(IceCreamOrder order)
	{
		_order = order;
	}
	
	@Override
	public void goToNextStep() {
		System.out.println("Order Delivered! No More Steps!");
	}

	@Override
	public void goToPreviousStep() {
		_order.setState(new AssignDeliveryPersonState(_order));
	}

	@Override
	public String getStep() {
		return "Delivery Ordered";
	}

}
