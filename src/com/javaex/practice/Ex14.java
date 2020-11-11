package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요: ");
		int width = sc.nextInt();
		System.out.print("세로를 입력하세요: ");
		int height = sc.nextInt();
		
		double result01 = width * height;
		double result02 = (width * 2) + (height * 2);
		System.out.print("사각형의 넓이는 ");
		System.out.println(result01);
		System.out.print("사각형의 둘레는 ");
		System.out.println(result02);
		sc.close();
				

	}

}
