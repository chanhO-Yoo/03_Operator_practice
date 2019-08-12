package com.kh.test.condition;

import java.util.Scanner;

/*
 * 키(cm)와 몸무게(kg)을 입력 받고, 
   BMI(체질량지수)를 계산하여 계산된 값에 따라 
       저체중(18.5미만), 정상체중(18.5이상 23미만), 과체중(23이상 25미만), 비만(25이상 30미만), 고도비만(30이상)을 출력하세요. 
   BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
 * 
 */

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
