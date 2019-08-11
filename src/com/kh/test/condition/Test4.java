package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("1~10사이의 정수를 입력하세요 : ");
		i = sc.nextInt();
		
		if(i<10 && i>1) {
			if(i%2==0) {
				System.out.println("짝수다");
			}
			else if(i%0==1) {
				System.out.println("홀수다");
			}
		}
		else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
		
	}
	
}
