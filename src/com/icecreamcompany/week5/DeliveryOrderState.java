package com.icecreamcompany.week5;

public interface DeliveryOrderState {
	void goToNextStep();
	void goToPreviousStep();
	String getStep();
}
