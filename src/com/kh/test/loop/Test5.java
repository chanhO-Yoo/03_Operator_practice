package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 t5 = new Test5();
//		t5.test();
		t5.test2();
	
	}
	
	//3명의 회원 정보를 입력 받아 저장하고, 출력하는 프로그램을 만드시오.
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 나이, 주소, 키, 몸무게, 연락처를 입력하세요 : ");
		String input1 = sc.nextLine();
		String[] inputArr1 = input1.split(",");
		
		System.out.println("이름, 나이, 주소, 키, 몸무게, 연락처를 입력하세요 : ");
		String input2 = sc.nextLine();
		String[] inputArr2 = input2.split(",");
		
		System.out.println("이름, 나이, 주소, 키, 몸무게, 연락처를 입력하세요 : ");
		String input3 = sc.nextLine();
		String[] inputArr3 = input3.split(",");
		
		System.out.println("===============저장회원===============");
		System.out.print("1 ");
		for(int j=0;j<inputArr1.length;j++) {
			System.out.print(inputArr1[j]);
		}
		System.out.println();
		
		System.out.print("2 ");
		for(int j=0;j<inputArr2.length;j++) {
			System.out.print(inputArr2[j]);
		}
		System.out.println();
		
		System.out.print("3 ");
		for(int j=0;j<inputArr3.length;j++) {
			System.out.print(inputArr3[j]);
		}
		System.out.println();
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 나이, 주소, 키, 몸무게, 연락처를 입력하세요 : ");
		String input1 = sc.nextLine();
		String[] inputArr1 = input1.split(",");
		
		System.out.println("이름, 나이, 주소, 키, 몸무게, 연락처를 입력하세요 : ");
		String input2 = sc.nextLine();
		String[] inputArr2 = input2.split(",");
		
		System.out.println("이름, 나이, 주소, 키, 몸무게, 연락처를 입력하세요 : ");
		String input3 = sc.nextLine();
		String[] inputArr3 = input3.split(",");
		
		System.out.println("===============저장회원===============");
		System.out.print("1 ");
		for(int j=0;j<inputArr1.length;j++) {
			System.out.print(inputArr1[j]+" ");
		}
		System.out.println();
		
		System.out.print("2 ");
		for(int j=0;j<inputArr2.length;j++) {
			System.out.print(inputArr2[j]+" ");
		}
		System.out.println();
		
		System.out.print("3 ");
		for(int j=0;j<inputArr3.length;j++) {
			System.out.print(inputArr3[j]+" ");
		}
		
		double avgAge = (Double.parseDouble(inputArr1[1]) + Double.parseDouble(inputArr2[1]) + Double.parseDouble(inputArr3[1])) / 3;
		double avgHeight = (Double.parseDouble(inputArr1[3]) + Double.parseDouble(inputArr2[3]) + Double.parseDouble(inputArr3[3])) / 3;
		double avgWeight = (Double.parseDouble(inputArr1[4]) + Double.parseDouble(inputArr2[4]) + Double.parseDouble(inputArr3[4])) / 3;
		
		System.out.println("====================================");
		System.out.printf("평균 나이 : %f세 / 평균 키 : %fcm / 평균 체중 : %fkg", avgAge, avgHeight, avgWeight);
		
	}
}
