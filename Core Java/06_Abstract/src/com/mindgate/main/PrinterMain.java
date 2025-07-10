package com.mindgate.main;

import com.mindgate.main.domain.HP3235;
import com.mindgate.main.domain.WifiPlugin;

public class PrinterMain {
	public static void main(String[] args) {
//		Printer printer = new Canon580();
//		printer.doPrinting();

		WifiPlugin wifiPlugin = new HP3235();
		// wifiPlugin.doPrinting();
		wifiPlugin.doWifiPrinting();
	}
}
