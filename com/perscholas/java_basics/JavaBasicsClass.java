package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addIntegers();
		addDoubles();
		addMixedDataType();
		dividingIntegers();
		castToInt();
		castToDouble();
		calculateConstant();
		cafeCalculator();
	}
	public static void addIntegers() {
		int num1 = 2;
		int num2  = 3;
		int result = num1 + num2;
		
		System.out.println("Adding integers: " + num1 + "+" + num2 + " = " +result);
	}
	public	static void addDoubles() {
		double num1 = 2;
		double num2 = 8.2;
		double result = num1 +num2;
		
		System.out.println("Adding doubles: "  + num1 + "+" + num2 +" = " + result);
	}
	public static void addMixedDataType() {
		int num1 = 3;
		double num2 = 2.3;
		double result = num1+num2;
		// variable must be a double
		System.out.println("Adding different data types: "  + num1 + "+" + num2 + " = " + result);
	}
	public static void dividingIntegers() {
		int num1 = 8;
		int num2  = 2;
		int result = num1 / num2;
		
		System.out.println("Dividing integers: "  + num1 + "/" + num2 +" = "+ result);
		/*
		 * An error will occur, int cannot accept a decimal as a value
		 * it needs to be a whole number
		 * can change data type to double for num1 and result to calculate
		 */
	}
	public static void castToInt() {
		double num1 = 8.3;
		double num2  = 2;
		double result = num1 / num2;
		int castInteger;
		
		System.out.println("Dividing doubles: "  + num1 + "/" + num2 +" = "+ result);
		castInteger = (int)result;
		System.out.println("Type Casting double to int: "  + num1 + "/" + num2 +" = "+ castInteger);
		/*
		 * narrow type casting, going from large data type to smaller 
		 */
	}
	public static void castToDouble() {
		int x =5;
		int y =6;
		int q = y/x;
		double z;
		
		System.out.println("Dividing integers: "  + y + "/" + x +" = "+ q);
		z = (double)q;
		System.out.println("Type Casting int to double: "  + y + "/" + x +" = "+ z);
	}
	public static void calculateConstant() {
		final double PI =3.14;
		double radius = 5;
		double area = PI*(radius*radius);
		System.out.println("Calculating area with a constant: "  + area);
	}
	public static void cafeCalculator() {
		final double SALES_TAX = 1.08;
		double coffee = 4.15;
		double cappuccino = 6.25;
		double espressoShot = 5.00;
		double subtotal = (3*coffee)+(4*cappuccino)+(2*espressoShot);
		double totalSale = SALES_TAX + subtotal;
		
		System.out.println("Total cost of coffee is: " + totalSale);
	}
}
