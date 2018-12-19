package com.term;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
//	int a=19;
//	int cunt=0;
//	for(int i=3;i<=10;i++) {
//		for(int j=3;j<=10;j++) {
//			for(int x=3;x<=10;x++) {
//				for(int y=3;y<=10;y++) {
//					int m=i+j+x+y;
//					if(m==19) {
//						cunt++;
//						System.out.println("i, j ,x ,y="+i+","+j+","+x+","+y);
//					}
//				}
//			}
//		}
//	}
//	System.out.println(cunt);
	
	Scanner sc =new Scanner(System.in);
	System.out.println("输入一个字符串以英文分号\";\"分割为2个字符串:");
	String input=sc.nextLine();
	String []it=input.split(";");
	String s1=it[1];
	String s2=it[2];
	for(String s:it) {
	System.out.println(s);
	}
	
	
}
}
