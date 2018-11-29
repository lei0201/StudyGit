package com.lei.javabasis;

import java.util.Scanner;

public class ParityCheck {
public static void main(String[] args) {
	System.out.println("请输入一个数：");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String s=(a%2==0)?"a为偶数":"a为奇数";
	System.out.println(s);
	
}
}
