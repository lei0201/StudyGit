package com.term;

import java.math.BigDecimal;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
//		BigDecimal sum=new BigDecimal(0.0);
//		BigDecimal facorial=new BigDecimal(1.0);
//		int i=1;
//		while(i<=20) {
//			sum=sum.add(facorial);
//			++i;
//			facorial=facorial.multiply(new BigDecimal(1.0/i));
//			System.out.println(facorial);
//			}
//		System.out.println("1+1/2!+……+1/20！的计算结果等于：\n"+sum);
	BigDecimal sum=new BigDecimal(0.0);
	BigDecimal  factorial=new BigDecimal(1.0);
	int i=1;
	Scanner sc=new Scanner(System.in);
	int j=sc.nextInt();
	while (i<=j) {
		sum=sum.add(factorial);
		++i;
		factorial=factorial.multiply(new BigDecimal(1.0/i));
				
	}
	System.out.println("1+1/2!……+1/"+j+"!的结果是："+sum);
	}
}
