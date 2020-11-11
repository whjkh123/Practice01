package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		int ray = sc.nextInt();
		double v = (double)4 * 3.14 * ray * ray * ray / 3;
		System.out.println("구의 부피는: " + v);
		sc.close();

	}

}
