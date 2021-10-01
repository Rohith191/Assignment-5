package com.icecreamcompany.week5;

public interface DeliveryOrderState {
	void proceedToNextStep();
	void goBackToPreviousStep();
	void cancelOrder();
	String getStep();
}
