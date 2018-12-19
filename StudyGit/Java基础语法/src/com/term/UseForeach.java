package com.term;
import java.util.ArrayList;
import java.util.List;

public class UseForeach {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("helloword");
	list.add("asd");
	list.add("qwe");
	list.add("zxzc");
	list.add("xyz");
	list.add("qwsa");
	list.add("kjkk");
	System.out.println("使用foreach");
	for (String a : list) {
		System.out.print(a+"\t");
		}
	System.out.println();
	String[] strt=new String[list.size()];//创建数组，并把集合的长度赋值给数组
	list.toArray(strt);//把集合的值赋给数组
	//System.out.println(strt);
	for (String string : strt) {
		System.out.println(string);
	}
}

}
