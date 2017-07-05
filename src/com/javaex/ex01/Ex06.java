package com.javaex.ex01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int x = sc.nextInt();
		int sum=0;
		if(x%2==0) {
			for(int y=0;y<=x;y+=2) {
				sum+=y;
			}
			System.out.println(sum);
		}else {
			for(int z=1;z<=x;z+=2) {
				sum+=z;
				
				
			}
		}
		

		System.out.println("결과 값 : " + sum);
		sc.close();
	}

}
