package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		SwitchTest st = new SwitchTest();
		st.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======사용용도=======");
		System.out.println("1. 가정용 (50원/liter)");
		System.out.println("2. 상업용 (45원/liter)");
		System.out.println("3. 공업용 (30원/liter)");
		System.out.println("====================");
		System.out.print("사용 용도를 선택해주세요 : ");
		int choice = sc.nextInt();
		
		System.out.print("물 사용량을 입력하세요 : ");
		int useWater = sc.nextInt();
		
		int charge=0;
		int waterCharge=0;
		int totalCharge=0;
		
		switch(choice) {
		case 1:
			charge = 50 * useWater;
			waterCharge = (int)(charge * 0.05);
			totalCharge = charge + waterCharge;
			break;
		case 2:
			charge = 45 * useWater;
			waterCharge = (int)(charge * 0.05);
			totalCharge = charge + waterCharge;
			break;
		case 3:
			charge = 30 * useWater;
			waterCharge = (int)(charge * 0.05);
			totalCharge = charge + waterCharge;
			break;
		default:
			System.out.println("메뉴 번호는 1,2,3만 가능합니다.");
		}
		
		System.out.println("----------<<수도세>>----------");
		System.out.println("선택메뉴 번호 : "+choice+"를 선택하셨습니다");
		System.out.println("사용 요금 : "+ charge);
		System.out.println("수도세 : "+ waterCharge);
		System.out.println("총 수도 요금 : "+ totalCharge);
	}

}
