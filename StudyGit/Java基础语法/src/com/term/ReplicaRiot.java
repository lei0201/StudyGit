package com.term;

public class ReplicaRiot {
	public static void main(String[] args) {
		int [] array1=new int [7];
		int [] array2=new int [5];
		int [] array3=new int [12];
		for(int i=0;i<array1.length;i++) {
			array1[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<array2.length;i++) {
			array2[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<array3.length;i++) {
			array3[i]=(int)(Math.random()*100);
		}
		System.arraycopy(array1, 0, array3, 0, array1.length);//数组1复制到数组3
		System.arraycopy(array2, 0, array3, array1.length, array2.length);//数组2复制到数组3;注意数组3里面有数组1的元素，所以要从array1.length的位置开始复制，否则会覆盖掉前面数组1复制过来的元素
		for (int i : array1) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i : array2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i : array3) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
	}
	
}
