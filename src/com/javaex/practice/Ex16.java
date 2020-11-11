package com.javaex.practice;

public class Ex16 {

	public static void main(String[] args) {
		
		int price;
		price = 7500;
		
		int pay;
		pay = 10000;
		System.out.println("상품가격:" + price);
		System.out.println("받은 돈:" + pay);
		System.out.println("==================");
		double tax;
		tax = 0.1;
		System.out.println("받은 돈:" + (double)pay);
		System.out.println("상품가격:" + (double)price);
		double result;
		result = price * tax;
		System.out.println("부가세:" + result);
		double change;
		change = pay - (price + result);
		System.out.println("잔액:" + change);
		

	}

}
