package com.kh.test.condition;

import java.util.Scanner;

/*
 * 사용자에게 입력받은 문자하나를 문자타입에 따라 구분해 출력하세요.
 * 입력하신 문자 1 은/는  숫자입니다.
 * 입력하신 문자 c 은/는  알파벳입니다.
 * 입력하신 문자 Z 은/는  알파벳입니다.
 * 입력하신 문자 ㅋ 은/는  한글입니다.
 * 입력하신 문자 * 은/는  특수문자입니다.
 */

public class ChanrTest {
	public static void main(String[] args) {
		char c;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		c = sc.next().charAt(0);
		
//		if (c >= 33 && c <= 47) {
//			System.out.printf("입력하신 문자 %s 은/는  특수문자입니다.", c);
//		}
//		else if (c >= 48 && c <= 57) {
//			System.out.printf("입력하신 문자 %s 은/는  숫자입니다.", c);
//		}
//		else if (c >= 58 && c <= 64) {
//			System.out.printf("입력하신 문자 %s 은/는  특수문자입니다.", c);
//		}
//		else if (c >= 65 && c <= 90) {
//			System.out.printf("입력하신 문자 %s 은/는  알파벳입니다.", c);
//		}
//		else if (c >= 91 && c <= 96) {
//			System.out.printf("입력하신 문자 %s 은/는  특수문자입니다.", c);
//		}
//		else if (c >= 97 && c <= 122) {
//			System.out.printf("입력하신 문자 %s 은/는  알파벳입니다.", c);
//		}
//		else if (c >= 123 && c <= 126) {
//			System.out.printf("입력하신 문자 %s 은/는  특수문자입니다.", c);
//		}
//		else if(c>=44032 && c <=55203) {
//			System.out.printf("입력하신 문자 %s 은/는  한글입니다.", c);
//		}
//		else {
//			System.out.println("잘못된 입력입니다.");
//		}
		
		//Java api 메소드 사용하기
		//조건식에 사용될 메소드 타입 : return 타입이 boolean인 메소드
		//isDigit() : 숫자인지 판별
		if(Character.isDigit(c))
			result = "숫자";
		// isUpperCase: 알파벳 대문자인지 판별
		else if(Character.isUpperCase(c))
			result = "알파벳";
		// isLowerCase: 알파벳 소문자인지 판별
		else if(Character.isLowerCase(c))
			result = "알파벳";	
		else if('가'<=c && c <='힣')//\uAC00-\uD7AF  44032-55215
			result = "한글";
		else 
			result = "기타특수문자";
		
		System.out.println("입력하신 문자 "+ c + "는 "+ result + "입니다.");
	}

}
