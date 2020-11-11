package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		int price = sc.nextInt();
		System.out.print("받은 돈: ");
		int pay = sc.nextInt();
		System.out.println("==================");
		System.out.println("받은 돈: " + (double)pay);
		System.out.println("상품가격: " + (double)price);
		double tax = 0.1;
		double result = price * tax;
		System.out.println("부가세: " + result);
		double change = pay - price;
		System.out.println("잔액: " + change);
		sc.close();

	}

}
