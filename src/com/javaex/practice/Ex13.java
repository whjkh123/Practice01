package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		double dollor = 1230.95;
		int won1;
		won1 = 123095; 
		System.out.println("환전 할 원화를 입력하세요:" + won1);
		double result1 = won1 / (int)dollor;
		System.out.println("받으실 달러는" + result1);
		int won2;
		won2 = 1000000;
		System.out.println("환전 할 원화를 입력하세요:" + won2);
		double result2 = won2 / dollor;
		System.out.println("받으실 달러는" + result2);

	}

}
