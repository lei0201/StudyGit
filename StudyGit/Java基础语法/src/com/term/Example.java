package com.term;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=s.nextLine();
		System.out.println();
		System.out.println("请输入语言：");
		String language=s.nextLine();
		//System.out.println(language.hashCode());
		//java 3254818
		//c 99
		//c# 3104
		//php 110968 PHP 79192
		switch(language.hashCode()) {
		case 3254818:System.out.println("员工"+name+"分配到"+language+"部门");
			break;
		case 99:System.out.println("员工"+name+"分配到"+language+"部门");
			break;
		case 3104:System.out.println("员工"+name+"分配到"+language+"部门");
			break;		
		case 110968:System.out.println("员工"+name+"分配到"+language+"部门");
			break;
		default:System.out.println("员工"+name+"分配到其他部门");
			break;
	}

	}

}
