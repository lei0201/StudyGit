package com.lei.javabasis;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个英文字符串或解密字符串");
		String s=sc.nextLine();
		char array[]=s.toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			array[i]=(char)(array[i]^1);
			System.out.println(array[i]);
			
		}
		System.out.println("加密数据或解密如下："+new String(array));
		//System.err.println(new String(array));
		
	}

}
