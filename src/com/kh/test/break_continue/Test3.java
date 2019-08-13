package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2보다 큰 정수를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i=1;i<input;i++) {
			if(input%i!=0) {
				continue;
			}
			count++;
		}
		
		if(count!=1) {
			System.out.println("소수가 아닙니다.");
		}
		else {
			System.out.println("소수입니다.");
		}
		
	}
}
