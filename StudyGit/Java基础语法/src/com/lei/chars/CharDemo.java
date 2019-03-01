package com.lei.chars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 *通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
	参考的转换方式:
  	String str = "abc123";
	char[] cs = str.toCharArray(); 
转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
 */

public class CharDemo {
	public static void main(String[] args) {
		List<Character> sz=new ArrayList<Character>();
		List<Character> zf=new ArrayList<Character>();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str=sc.nextLine();
		char[]a=str.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(Character.isDigit(a[i])) {
				sz.add(a[i]);				
				}
			
		 if(Character.isUpperCase(a[i])) {
				
				zf.add(a[i]);
			}
			
		}
		System.out.printf("字符串包含数字为：%s%n",sz);
		Collections.sort(sz);
		System.out.printf("排序好的数字：%s%n",sz);
		Collections.shuffle(sz);
		System.out.printf("混淆的数字：%s%n",sz);
		Collections.swap(sz, 0, 5);
		System.out.printf("交换下0和5下标的数字：%s%n",sz);
		Collections.rotate(sz, 5);
		System.out.printf("向右移动5个位置下标好的数字：%s%n",sz);
		System.out.printf("字符串包含大写字母为：%s%n",zf);
	}

}
