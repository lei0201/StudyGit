package com.lei.javabasis;

import java.math.BigDecimal;
/**
 * BigDecimal类进行精确运算
 * @author Administrator
 * 
 *
 */
public class AccuratelyFloat {
public static void main(String[] args) {
	int money=2;
	double price=1.2;
	double result=money-price;
	System.out.println("非精确计算："+result);
	BigDecimal money1=new BigDecimal("2");
	BigDecimal price1=new BigDecimal("1.25");
	BigDecimal result1=money1.subtract(price1);
	System.out.println("精确计算："+result1);
	BigDecimal ad=money1.add(price1);
	System.out.println("加法："+ad);
	BigDecimal mu=money1.multiply(price1);
	System.out.println("乘法："+mu);
	BigDecimal di=money1.divide(price1);
	//如果除不尽。将会报错java.lang.ArithmeticException
	System.out.println("除法："+di);
	
	
}
}
