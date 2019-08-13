package com.kh.test.break_continue;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
		
	}
	
	public void test() {
		int count=0;//정답 시도 횟수
		int rndNum = (int)(Math.random()*100); //임의의 난수 발생
//		System.out.println(rndNum);
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;;i++) {
			System.out.print("정답을 입력하세요 : ");
			int tryNum = sc.nextInt();
			count++;
		
			if(rndNum < tryNum) {
				System.out.println("입력하신 정수보다 작습니다.");
			}
			else if(rndNum == tryNum) {
				System.out.printf("정답입니다. %d회 만에 정답을 맞추셨습니다.",count);
				break;
			}
			else {
				System.out.println("입력하신 정수보다 큽니다.");
			}
		}
		
	}
}
