package com.kosmo;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("두수를 입력하세요");
		s1=sc.next();
		s2=sc.next();
		
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		//System.out.println(a+","+b);
		int c = a+b;
		//System.out.println("두수의합은 "+ c+"30입니다.");
		System.out.printf("%d와%d의합은 %d입니다.",a,b,a+b);
		sc.close();
	}

}
