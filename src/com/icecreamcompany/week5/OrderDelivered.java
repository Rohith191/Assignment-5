package com.icecreamcompany.week5;

public class OrderDelivered implements DeliveryOrderState {
	
	IceCreamOrderProcess _order;
	
	public OrderDelivered(IceCreamOrderProcess order)
	{
		_order = order;
	}
	
	@Override
	public void proceedToNextStep() {
		System.out.println("Order Delivered! No More Steps!");
	}

	@Override
	public void goBackToPreviousStep() {
		_order.setState(new AssignDeliveryPersonState(_order));
	}

	@Override
	public String getStep() {
		return "Delivery Ordered";
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cannot cancel since order is already Delivered!");
	}

}
