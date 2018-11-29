package com.lei.javabasis;

import java.io.PrintStream;

public class RedirectOutputStream {
	public static void main(String[] args) {
		try {
			PrintStream out=System.out;
			PrintStream ps=new PrintStream("C:\\Users\\Administrator\\Desktop\\1.txt");
			System.setOut(ps);
			int age=18;
			System.out.println("年龄变量成功定义，初始值为18");
			String sex="男";
			System.out.println("性别变量成功定义，初始化为"+sex);
			String a="这是个"+sex+"孩子，应该有"+age+"岁了";
			System.out.println("整合两个变量为a字符字符串变量，其结果为："+a);
			System.setOut(out);;
			System.out.println("程序运行完毕，请查看日志文件。");
		}
		catch (Exception e) {
			e.printStackTrace();		}
	}
}