package com.mindgate.main;

import com.mindgate.main.util.CalculationUtil;

public class CalculationMain {
	public static void main(String[] args) {
		System.out.println("main() start");
		CalculationUtil calculationUtil = new CalculationUtil();
		calculationUtil.accept();
		System.out.println();
		calculationUtil.calculate();
		System.out.println();
		calculationUtil.display();
		System.out.println("main() end");
	}
}
