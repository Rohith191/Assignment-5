package com.icecreamcompany.week5;

public class MakeSelectionState implements DeliveryOrderState {
	
	IceCreamOrder _order;
	
	public MakeSelectionState(IceCreamOrder order)
	{
		this._order = order;
	}
	
	@Override
	public void goToNextStep() {
		_order.setState(new MakePaymentState(_order));
	}

	@Override
	public void goToPreviousStep() {
		System.out.println("No previous step available!");
	}

	@Override
	public String getStep() {
		return "Make Selection";
	}

}
