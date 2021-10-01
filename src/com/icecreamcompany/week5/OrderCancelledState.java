package com.icecreamcompany.week5;

public class OrderCancelledState implements DeliveryOrderState {
	IceCreamOrderProcess _order;
	public OrderCancelledState(IceCreamOrderProcess order)
	{
		_order = order;
	}
	@Override
	public void proceedToNextStep() {
		System.out.println("Cannot proceed to next step as the order is canceled");
	}

	@Override
	public void goBackToPreviousStep() {
		System.out.println("Cannot go back to previous to next step as the order is canceled. Create new order or reset order.");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Order is already caneled! Start new order process");
	}

	@Override
	public String getStep() {
		// TODO Auto-generated method stub
		return "Order Canceled";
	}

}
