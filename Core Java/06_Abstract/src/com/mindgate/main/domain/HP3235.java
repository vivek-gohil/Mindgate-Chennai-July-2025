package com.mindgate.main.domain;

public class HP3235 extends Printer implements WifiPlugin {

	@Override
	public void doPrinting() {
		System.out.println("HP3235 is printing");
	}

	@Override
	public void doWifiPrinting() {
		System.out.println("HP3235 is printing over Wifi");

	}

}
