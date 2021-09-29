package com.icecreamfactory.week5;

public interface VendingMachineState {
	void setFlavour(String flavour);
	void acceptCash(Integer cash);
	void cancelOrder();
	void dispense();
	void setError(String error);
	void ejectCash();
}
