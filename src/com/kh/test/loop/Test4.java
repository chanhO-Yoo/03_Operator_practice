package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test();
	}

	//문자열을 입력받고
	//문자열에서 찾을 문자를 입력받아
	//문자열에서 해당 문자가 몇 개있는지 개수를 확인하는 프로그램
	public void test() {
		Scanner sc = new Scanner(System.in);
		String inputStr;
		char inputChar;
		int count = 0;
		
		System.out.print("문자열을 입력하세요 : ");
		inputStr = sc.next();
		System.out.print("찾을 문자을 입력하세요 : ");
		inputChar = sc.next().charAt(0);
		
		//영문자 여부 검사
		//inputChar이 대문자인지, 소문자인지 확인
//		if(Character.isUpperCase(inputChar) || Character.isLowerCase(inputChar)) {
		if(('a' <= inputChar && inputChar <='z') || ('A' <= inputChar && inputChar <='Z')) {
			//문자열의 길이만큼 맨처음부터 끝까지 반복
			//입력한 문자열에서 찾을 문자 갯수 확인
			for (int i = 0; i < inputStr.length(); i++) {
				if(inputStr.charAt(i)==inputChar) {
					count += 1;
				}
			}
			System.out.printf("'%c'가 포함된 갯수 : %d",inputChar, count);
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
		
	}
}
