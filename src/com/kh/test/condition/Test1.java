package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
		t1.test3();
	}

	/*
 	1. 국어, 영어, 수학 점수를 입력 받아 합계, 평균을 계산하고 
 	합계가 250점 이상이면 “우수생입니다.”를 출력하는 코드를 작성하세요.
	 */
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		int kScore;
		int eScore;
		int mScore;
		int sum;
		int average;
		
		System.out.print("국어 점수를 입력하세요 : ");
		kScore = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eScore = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mScore = sc.nextInt();
		
		sum = kScore + eScore + mScore;
		average = sum / 3;
	
		if(sum >= 250) {
			System.out.println("우수생입니다.");
		}
	}
	
	/*
 	2. A, B, C연봉을 입력하고 각 연봉을 입력하고 
 	연봉이 5000이상이면 “0은 고액연봉자입니다” 라고 출력하는 프로그램을 작성하세요.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		int aIncome;
		int bIncome;
		int cIncome;
		
		System.out.print("연봉을 입력하세요 : ");
		aIncome = sc.nextInt();
		income(aIncome);
		
		System.out.print("연봉을 입력하세요 : ");
		bIncome = sc.nextInt();
		income(bIncome);
		
		System.out.print("연봉을 입력하세요 : ");
		cIncome = sc.nextInt();
		income(cIncome);
//		if(aIncome >= 5000) {
//			System.out.println("당신은 고액 연봉자입니다.");
//		}
//		else
//		{
//			System.out.println("당신은 고액 연봉자가 아닙니다.");
//		}
//		
//		if(bIncome >= 5000) {
//			System.out.println("당신은 고액 연봉자입니다.");
//		}
//		else
//		{
//			System.out.println("당신은 고액 연봉자가 아닙니다.");
//		}
//		
//		if(cIncome >= 5000) {
//			System.out.println("당신은 고액 연봉자입니다.");
//		}
//		else
//		{
//			System.out.println("당신은 고액 연봉자가 아닙니다.");
//		}
	}
	
	
	//test2에 수입을 비교 후 출력문을 나타내기 위한 메소드
	public void income(int userIncome) {
		if(userIncome >= 5000) {
			System.out.println("당신은 고액 연봉자입니다.");
		}
		else
		{
			System.out.println("당신은 고액 연봉자가 아닙니다.");
		}
	}

	/*
 	3. 정수 한 개를 입력 받아 짝수면 “짝수다” 홀수면 “홀수다라고 출력하세요.
	 */
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int cal = sc.nextInt();
		
		if(cal % 2 == 0) {
			System.out.println("짝수다");
		}
		else {
			System.out.println("홀수다");
		}
	}

}
