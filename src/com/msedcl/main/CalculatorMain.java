package com.msedcl.main;

import com.msedcl.main.util.CalculatorUtil;

public class CalculatorMain {
	public static void main(String[] args) {
		CalculatorUtil cu = new CalculatorUtil();
		System.out.println("Addition: "+cu.addition(10, 20));
		System.out.println("Subtraction: "+cu.subtraction(10, 20));
		System.out.println("Multiplication: "+cu.mulultiplication(10, 20));
	}
}