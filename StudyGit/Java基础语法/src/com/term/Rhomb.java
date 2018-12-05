package com.term;
import java.util.Scanner;
/**
 * 
 * @author Administrator
 *空心菱形打印输出思路：
 *我们首先打印出实心菱形
 *再在实心输出“*”的for循环进行选择在开始和结尾输出“*”其他位置输出空格
 */
public class Rhomb {
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入菱形行数：");
		int diagonal=sc.nextInt();
		maps(diagonal);
 }
public static void maps(int diagonal) {
		for(int i=1;i<=diagonal;i++ ) {
			for(int j=1;j<=diagonal-i;j++) {
				System.out.print(" ");
				}
			for(int k=1;k<=2*i-1;k++) {
				if(k==1||k==2*i-1) {System.out.print("*");}
				else{System.out.print(" ");}
			}
			System.out.println();
			
			}
		for(int i=1;i<diagonal;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*(diagonal-i)-1;k++){
				if(k==1||k==2*(diagonal-i)-1)System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}
}
