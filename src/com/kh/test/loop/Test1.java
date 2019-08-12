package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
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
