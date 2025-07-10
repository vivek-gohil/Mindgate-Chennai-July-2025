package com.mindgate.main.domain;

public class Canon580 extends Printer implements A3PrintPlugin {

	@Override
	public void doPrinting() {
		System.out.println("Canon580 is printing");
	}

	@Override
	public void doA3Printing() {
		System.out.println("Canon580 is printing A3 pages");
	}

}
