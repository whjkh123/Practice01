package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double mile = 1.609;
		System.out.print("마일을 입력하세요: ");
		int x = sc.nextInt();
		double killo = x * mile;
		System.out.println(+ x + "마일은 " + killo + "킬로미터 입니다.");
		sc.close();
		
	}

}
