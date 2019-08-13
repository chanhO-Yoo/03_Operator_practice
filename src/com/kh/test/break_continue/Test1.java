package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
//		t1.test1();
//		t1.test2();
		t1.test3();
		
	}
	
	//1부터 시작해 제곱의 값이 1000보다 작은 범위의 숫자와 제곱값을 출력
	//for문 버전
	public void test1() {
		int num;
		int squaredNum;
		String resultNum = " ";
		String resultSquaredNum = " ";
		
		for(num=1;;num++) {
//			squaredNum = num * num;
			squaredNum = (int)Math.pow(num,2);
			if(squaredNum<1000) {
				resultNum += num + "\t";
				resultSquaredNum += squaredNum + "\t";
			}
			else {
				break;
			}
		}
		System.out.println("resutlNum 	 = "+resultNum);
		System.out.println("resutlSquaredNum = "+resultSquaredNum);
		
	}
	
	//ascii코드 중 숫자와 영문자만 출력하기
	//for문 버전
	public void test2() {
		
		for(int i=0;i<128;i++) {
			if((i>='0' && i<='9')||(i>='a' && i<='z')||(i>='A' && i<='Z')) {
				System.out.println((char)i);
			}
			else {
				continue;
			}
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int inputNum1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int inputNum2 = sc.nextInt();
		
		int oddSum=0;
		String result="";
		
		if(inputNum1-inputNum2>0) {
			for(int i=inputNum2;i<=inputNum1;i++) {
				if(i%2==0) {
					continue;
				}
				oddSum += i;
				result = inputNum2 + "부터 "+ inputNum1 + "까지의 홀수의 합은 " + oddSum + "입니다.";
			}
		}
		else if(inputNum1-inputNum2<0) {
			for(int i=inputNum1;i<=inputNum2;i++) {
				if(i%2==0) {
					continue;
				}
				oddSum += i;
				result = inputNum1 + "부터 "+ inputNum2 + "까지의 홀수의 합은 " + oddSum + "입니다.";
			}
		}
		else {
			System.out.println("두 수는 같습니다.");
		}
		
		System.out.println(result);
	}
	
}


