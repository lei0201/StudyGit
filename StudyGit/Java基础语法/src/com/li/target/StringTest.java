package com.li.target;
/**
 * 
 * 创建一个类，它包含一个未初始化的string引用。验证该引用被初始化成了null
 * @author Administrator
 *
 */
public class StringTest {
	public String j;//未被初始化的String 为null
public static void main(String[] args) {
StringTest st=new StringTest();
	System.out.println(st.j);
}
}
