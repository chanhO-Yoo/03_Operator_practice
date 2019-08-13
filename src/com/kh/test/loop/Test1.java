package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
//		t1.test();
		t1.test2();
	}
		/*
		 * @실습문제
		 * 사용자의 이름과 출력할 횟수를 입력받아
		 * 이름을 지정한 횟수만큼 출력하기
		 * 
		 */
	public void test2() {
//		String name = "홍길동";
//		for(int i=0;i<3;i++) {
//			System.out.println(name);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("횟수 : ");
		int count = sc.nextInt();
		
		for(int i=0; i<count;i++) {
//		for(int i=count; i>=1;i++) {
			System.out.println(name);
		}
		
	}
	
	
	
	
	//1부터 사용자가 입력한 정수까지 존재하는 짝수의 합을 출력(for문 이용)
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputInt = sc.nextInt();
		int total = 0;
		
		for(int i=1 ;i<=inputInt;i++) {
			if(i%2==0) {
				total += i;
			}
		}
		
		System.out.println("total = " + total);
	}
}
