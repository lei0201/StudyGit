package com.term;

public class CycUtmost {//死循环
	public static void main(String[] args) {
		int a=Integer.MAX_VALUE;
		int some=a-50;
		int count=0;
		for(int i=some; i<=a;i++) {
			count++;
		}
		System.out.println(count);//编程最怕的不是报错，而是不报错还不显示结果。
	}

}
