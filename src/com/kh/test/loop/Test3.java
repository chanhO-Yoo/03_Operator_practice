package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	//정수를 입력받아 입력된 값의 구구단 프로그램을 만드시오.
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNum = sc.nextInt();
		
		if(inputNum <=9 && inputNum >=1) {
			System.out.println(inputNum+" 입력");
			for(int i = 1; i<10; i++) {
				System.out.printf("%d X %d = %d\n", inputNum, i, inputNum*i);
			}
		}
		else {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}
}
