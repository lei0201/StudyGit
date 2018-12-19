package com.lei.javabasis;
import java.util.Scanner;
public class VariableExchange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入要互换的第一个数字：");
	int x=sc.nextInt();
	System.out.println("请输入要跟换的第二个数：");
	int y=sc.nextInt();
	x=x^y;
//	System.out.println("x="+x);
//	System.out.println(",y="+y);
	y=y^x;
//	System.out.println("x="+x);
//	System.out.println(",y="+y);
	x=x^y;
//	System.out.println("x="+x);
//	System.out.println(",y="+y);
	System.out.println("x="+x+",y="+y);
	
}
}
