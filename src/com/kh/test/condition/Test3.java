package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		String c;
		int cal;
		
		System.out.print("정수를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		c = sc.next();
		
		if(c.equals("+")) {
			cal = a+b;
			System.out.printf("%d %s %d = %d",a,c,b,cal);
		}
		else if(c.equals("-")) {
			cal = a-b;
			System.out.printf("%d %s %d = %d",a,c,b,cal);
		}
		else if(c.equals("*")) {
			cal = a*b;
			System.out.printf("%d %s %d = %d",a,c,b,cal);
		}
		else if(c.equals("/")) {
			cal = a/b;
			System.out.printf("%d %s %d = %d",a,c,b,cal);
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}

}
