package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}

	/*
 	국어(int), 영어(int), 수학(int) 점수를 정수형으로 입력 받아 
 	총점(int)과 평균(double)을 계산하고 세 과목의 점수와 평균을 가지고 합격여부 처리, 
 	세 과목 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 
 	합격, 아니면 불합격을 출력하는 프로그램을 작성하세요. 
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		int kScore;
		int eScore;
		int mScore;
		int sum;
		double average;
		
		System.out.print("국어 점수를 입력하세요 : ");
		kScore = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eScore = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mScore = sc.nextInt();
		
		sum = kScore + eScore + mScore;
		average = sum / 3;
		
		if(kScore >= 40 && eScore >= 40 && mScore >= 40 && average >= 60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
	}
}
