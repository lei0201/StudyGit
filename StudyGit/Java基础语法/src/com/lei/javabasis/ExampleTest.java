package com.lei.javabasis;
import java.util.Scanner;
public class ExampleTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入要计算的数字：");
	long number=sc.nextLong();
	System.out.println("该数字为："+number);
	System.out.println("该数字乘以2的结果："+(number<<1));
	System.out.println("该数字乘以4的结果："+(number<<2));
	System.out.println("该结果乘以8的结果："+(number<<3));
}
}
