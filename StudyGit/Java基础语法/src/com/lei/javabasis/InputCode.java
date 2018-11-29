package com.lei.javabasis;
import java.util.Scanner;
/**
 * 
 * @author Administrator
 *	Scanner是扫描器类
 *System.in()是标准输入流
 *nextInt()从输入流获取int类型值
 *nextLine()从输入流获取String类型值
 */
public class InputCode {
	public static void main(String[] args) {
		System.out.println("请输入你的年龄");
		Scanner sc=new Scanner(System.in);
				int age=sc.nextInt();
		System.out.println("请输入你的姓名：");
		 String name=sc.nextLine();
		System.out.println("您的是："+age+"岁呀，"+name);
	}
}
