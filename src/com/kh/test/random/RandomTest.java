package com.kh.test.random;

import java.util.Scanner;
import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		RandomTest r = new RandomTest();
		r.test1();
	}
	
	public void test1() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
		
		int userChoice = sc.nextInt();
		int comChoice = r.nextInt(3)+1;
		
		String user = "당신";
		String com = "컴퓨터";
		
		System.out.println("========결과========");
		//사람 선택
		rcp(user, userChoice);
		
//		if(userChoice == 1) {
//			System.out.println("당신은 가위를 냈습니다.");
//		}
//		else if(userChoice == 2) {
//			System.out.println("당신은 바위를 냈습니다.");
//		}
//		else {
//			System.out.println("당신은 보를 냈습니다.");
//		}
		
		//컴퓨터 선택
		rcp(com, comChoice);
//		if(comChoice == 1) {
//			System.out.println("컴퓨터는 가위를 냈습니다.");
//		}
//		else if(comChoice == 2) {
//			System.out.println("컴퓨터는 바위를 냈습니다.");
//		}
//		else {
//			System.out.println("컴퓨터는 보를 냈습니다.");
//		}
		System.out.println("==================");
		
		if(userChoice == 2 && comChoice == 1) {
			System.out.println("당신이 이겼습니다.");
		}
		else if(userChoice == 3 && comChoice == 2) {
			System.out.println("당신이 이겼습니다.");
		}
		else if(userChoice == 1 && comChoice == 3) {
			System.out.println("당신이 이겼습니다.");
		}
		else if(userChoice == comChoice){
			System.out.println("비겼습니다.");
		}
		else {
			System.out.println("당신이 졌습니다.");
		}
	}
	
	public void rcp(String name, int choice) {
		if(choice == 1) {
			System.out.printf("%s은(는) 가위를 냈습니다.\n", name);
		}
		else if(choice == 2) {
			System.out.printf("%s은(는) 바위를 냈습니다.\n", name);
		}
		else {
			System.out.printf("%s은(는) 보를 냈습니다.\n", name);
		}
	}
}
