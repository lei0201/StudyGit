package com.term;

import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
	int [][]a=new int[5][8];
	int []a1=new int [40]; 
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]= (int) (Math.random()*100);
			
		}
		
		
	}for(int b[]:a) {
		for(int c:b) {
			System.out.print(c+"\t");
			
		}System.out.println();
	}System.out.println("******************");
	
	for(int i=0,j=0;i<a.length;i++,j+=8) {
		System.arraycopy(a[i], 0, a1, j, a[i].length);
		
	}
	Arrays.sort(a1);
	for(int i=0,j=0;i<5;i++,j+=8) {
		System.arraycopy(a1, j, a[i], 0, 8);
	}
	for(int b[]:a) {
		for(int c:b) {
			System.out.print(c+"\t");
			
		}System.out.println();
	}
}
}
