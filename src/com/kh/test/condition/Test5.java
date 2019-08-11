package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
		
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		double height;
		double weight;
		double bmi;
		
		System.out.print("키를 입력하세요 : ");
		height = sc.nextDouble();
		System.out.print("체중를 입력하세요 : ");
		weight = sc.nextDouble();
		
		bmi = weight / (height/100 * height/100);
		
		if(bmi < 18.5) {
			System.out.printf("BMI는  %.1f입니다. 저체중입니다.",bmi);
		}
		else if(bmi < 23 && bmi >= 18.5) {
			System.out.printf("BMI는  %.1f입니다. 정상체중입니다.",bmi);
		}
		else if(bmi < 25 && bmi >= 23) {
			System.out.printf("BMI는  %.1f입니다. 과체중입니다.",bmi);
		}
		else if(bmi < 30 && bmi >= 25) {
			System.out.printf("BMI는  %.1f입니다. 비만입니다.",bmi);
		}
		else if(bmi >= 30) {
			System.out.printf("BMI는  %.1f입니다. 고도비만입니다.",bmi);
		}
		else {
			System.out.println("잘못입력했습니다.");
		}
	}

}
