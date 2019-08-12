package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		SwitchTest2 st2 = new SwitchTest2();
		st2.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int javaScore;
		int oracleScore;
		int htmlScore;
		
		int sum;
		double avgScore;
		char grade;
		String present;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("java점수를 입력하세요 : ");
		javaScore = sc.nextInt();		
		System.out.print("oracle점수를 입력하세요 : ");
		oracleScore = sc.nextInt();
		System.out.print("html점수를 입력하세요 : ");
		htmlScore = sc.nextInt();
		
		sum = javaScore + oracleScore + htmlScore;
		avgScore = sum / 3.0;
		
		switch((int)(avgScore/10)) {
		case 10:
		case 9:
			grade = 'A';
			present = "놀이공원이용권, 뷔페식사권, 치킨, 아이스크림";
			break;
		case 8:
			grade = 'B';
			present = "뷔페식사권, 치킨, 아이스크림";
			break;
		case 7:
			grade = 'C';
			present = "치킨, 아이스크림";
			break;
		case 6:
			grade = 'D';
			present = "아이스크림";
			break;
		default:
			grade = 'F';
			present = "꿀밤";
			break;
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("이름  Java Oracle HTML");
		System.out.println("--------------------------------------------------");
		System.out.printf("%s %d %d %d\n",name, javaScore, oracleScore, htmlScore);
		System.out.println("--------------------------------------------------");
		System.out.printf("총점 : %d\n",sum);
		System.out.printf("평균 : %.1f\n", avgScore);
		System.out.printf("학점 : %c\n", grade);
		System.out.printf("상품: %s\n", present);
		
	}
}
