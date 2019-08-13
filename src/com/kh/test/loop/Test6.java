package com.kh.test.loop;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 t6 = new Test6();
		t6.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 id, 종류, 상품명, 가격을 입력하세요 : ");
		String input1 = sc.nextLine();
		String[] inputArr1 = input1.split(",");
		
		System.out.print("상품 id, 종류, 상품명, 가격을 입력하세요 : ");
		String input2 = sc.nextLine();
		String[] inputArr2 = input2.split(",");
		
		System.out.print("상품 id, 종류, 상품명, 가격을 입력하세요 : ");
		String input3 = sc.nextLine();
		String[] inputArr3 = input3.split(",");
		
		System.out.print("상품 id, 종류, 상품명, 가격을 입력하세요 : ");
		String input4 = sc.nextLine();
		String[] inputArr4 = input4.split(",");
		
		System.out.print("상품 id, 종류, 상품명, 가격을 입력하세요 : ");
		String input5 = sc.nextLine();
		String[] inputArr5 = input5.split(",");
		
		System.out.println("====== 저장상품 ======");
		for(int i=0;i<inputArr1.length;i++) {
			System.out.print(inputArr1[i]+" ");
		}
		System.out.println();
		for(int j=0;j<inputArr2.length;j++) {
			System.out.print(inputArr2[j]+" ");
		}
		System.out.println();
		for(int j=0;j<inputArr3.length;j++) {
			System.out.print(inputArr3[j]+" ");
		}
		System.out.println();
		for(int j=0;j<inputArr4.length;j++) {
			System.out.print(inputArr4[j]+" ");
		}
		System.out.println();
		for(int j=0;j<inputArr5.length;j++) {
			System.out.print(inputArr5[j]+" ");
		}
		System.out.println();
		System.out.println("==================");
		double avgPrice = Double.parseDouble(inputArr1[3])+Double.parseDouble(inputArr2[3])+Double.parseDouble(inputArr3[3])+Double.parseDouble(inputArr4[3])+Double.parseDouble(inputArr5[3]);
		System.out.println("평균 상품 가격 : " + avgPrice);
		
	}
}
