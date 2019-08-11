package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
		t1.test3();
	}

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
	
	public void income(int userIncome) {
		if(userIncome >= 5000) {
			System.out.println("당신은 고액 연봉자입니다.");
		}
		else
		{
			System.out.println("당신은 고액 연봉자가 아닙니다.");
		}
	}

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
