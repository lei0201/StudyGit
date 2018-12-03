package com.term;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		System.out.println("*******闰年判断*********");
		
			System.out.println("请输入年份：");
			Scanner sc=new Scanner(System.in);
			int year=sc.nextInt();
		    annualJudgment(year);
								
	}
	public static void annualJudgment(int year) {
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"年，是闰年");
			
		}
		else {System.out.println(year+"年，不是闰年");}
		
	}
	
}
