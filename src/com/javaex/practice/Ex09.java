package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		double f = 80.0;
		System.out.println(5.0 / 9.0 * (f - 32.0));
		//double형은 실수를 정의한다. 5 / 9를 int로 변형.처리 되어 0.55..6의 값을 가지나, int는 정수만 표현가능해 0으로 처리되어 결국, 0 * (f - 32.0) 수식이 되고 그 결과값은 0이다.

	}

}
