package com.javaex.practice;

public class Ex14 {

	public static void main(String[] args) {
		
		double widht;
		double height;
		
		widht = 3;
		height = 4;
		
		System.out.println("가로를 입력하세요:" + (int)widht);
		System.out.println("세로를 입력하세요:" + (int)height);
		
		double extent;
		double round;
		
		extent = widht * height;
		round = (2 * widht) + (2 * height);
		
		System.out.println("사각형의 넓이는" + extent);
		System.out.println("사각형의 둘레는" + round);
		
		
		
				

	}

}
