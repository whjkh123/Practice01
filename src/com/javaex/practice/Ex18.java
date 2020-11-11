package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		int f = sc.nextInt();
		double c = (double)5 * (f - 32) / 9;
		System.out.println("화씨 " + (double)f + "의 섭씨온도는 " + c + "입니다.");
		sc.close();
	}

}
