package com.kh.test.condition;

import java.util.Scanner;

/*
정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요. 
 출력 예) 입력 5, 6, +
       5+6=11

 음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 “잘못 입력 하셨습니다.  프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.

*/

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int cal=0;
		
		String str;
		String result;
		
		char ch;
		
		System.out.print("정수를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		str = sc.next();
//		ch = sc.next().charAt(0);
		
		//사용자가 음수 입력시 프로그램 종료
		if(a < 0 || b < 0) {
			System.out.println("음수를 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		//str이 연산자와 같은지 비교
		if(str.equals("+")) {
			cal = a+b;
			System.out.printf("%d %s %d = %d",a,str,b,cal);
		}
		else if(str.equals("-")) {
			cal = a-b;
			System.out.printf("%d %s %d = %d",a,str,b,cal);
		}
		else if(str.equals("*")) {
			cal = a*b;
			System.out.printf("%d %s %d = %d",a,str,b,cal);
		}
		else if(str.equals("/")) {
			cal = a/b;
			System.out.printf("%d %s %d = %d",a,str,b,cal);
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
//		
//		if(ch == '+') {
//			cal = a+b;
//		}
//		else if(ch == '-') {
//			cal = a-b;
//		}
//		else if(ch == '*') {
//			cal = a-b;
//		}
//		else if(ch == '/') {
//			cal = a-b;
//		}
//		else {
//			System.out.println("잘못된 연산기호를 입력하셨습니다. 프로그램을 종료합니다.");
//		}
//		System.out.println(""+a+ch+b+"="+cal);
		//int + char => int연산
		//문자열 + int => 문자열
		//맨앞에 빈 문자를 삽입하여 문자열로서 처리한다.
		
	}

}
