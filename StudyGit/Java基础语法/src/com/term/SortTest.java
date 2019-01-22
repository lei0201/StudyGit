package com.term;

import java.awt.Robot;

public class SortTest {
	public static void main(String[] args) {
		int [] riot=new int [5];
		for(int i=0;i<riot.length;i++) {
			riot[i]=(int)(Math.random()*100);
			
		}
		//显示初始数组
		for(int i:riot) {
			System.out.print(i+"\t");
			
		}
		int max=riot[0];
		for(int ect:riot) {
			if(ect>max) {
				max=ect;
			}
		
		}
		System.out.println(max);
		//选择排序
		for(int i=0;i<riot.length;i++) {
			for(int j=riot.length-1;j>i;j--) {
				if(riot[i]>riot[j]) {
					riot[i]=riot[i]^riot[j];
					riot[j]=riot[i]^riot[j];
					riot[i]=riot[i]^riot[j];
				}
				
			}
			
		}
		//显示选择排序后的数组
		for(int j:riot) {
			System.out.print(j+"\t");
			
			
		}
		System.out.println();
		
		//使用冒泡排序
		for(int i=riot.length-1;i>=0;i--){
			for(int j=0;j<i;j++) {
				if(riot[i]<riot[j]) {
					riot[i]=riot[i]^riot[j];
					riot[j]=riot[i]^riot[j];
					riot[i]=riot[i]^riot[j];
					}
					}
		}
		for(int j:riot) {
			System.out.print(j+"\t");
			
		}
	}
}
