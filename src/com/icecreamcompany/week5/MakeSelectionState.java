package com.icecreamcompany.week5;

public class MakeSelectionState implements DeliveryOrderState {
	
	IceCreamOrderProcess _order;
	
	public MakeSelectionState(IceCreamOrderProcess order)
	{
		this._order = order;
	}
	
	@Override
	public void proceedToNextStep() {
		_order.setState(new MakePaymentState(_order));
	}

	@Override
	public void goBackToPreviousStep() {
		System.out.println("No previous step available!");
	}

	@Override
	public String getStep() {
		return "Make Selection";
	}
	
	@Override
	public void cancelOrder() {
		_order.setState(new OrderCancelledState(_order));
	}

}
