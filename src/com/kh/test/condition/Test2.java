package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}

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
