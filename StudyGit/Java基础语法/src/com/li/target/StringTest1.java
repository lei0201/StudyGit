package com.li.target;
//定义就初始化的String域和构造器初始化的String域有什么差异
public class StringTest1 {
	String a="123456";
	String b;
	public StringTest1() {
	b=a;
	System.out.println(b);
}
	public StringTest1(String a) {
		a=this.a;
		System.out.println("ax:"+a);
	}
	public static void main(String[] args) {
		StringTest1 st=new StringTest1();
		StringTest1 st1=new StringTest1();
		System.out.println("a:"+st.a+",b:"+st.b);
		}
}
