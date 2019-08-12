package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
	//정수를 입력받아 1부터 입력받은 정수까지 수를 짝수와 홀수로 나누어 홀수면 "수", 짝수면 "박"을 출력
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int inputNum = sc.nextInt();
		
		for(int i = 1; i<=inputNum;i++) {
			if(i%2==1) {
				System.out.printf("수");
			}
			else {
				System.out.printf("박");
			}
		}
	}
}
