package com.javaex.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int u=0; u<i; u++) {
				System.out.print(i);
			}	
			
			System.out.println("");
		}
		
		sc.close();
	}

}
