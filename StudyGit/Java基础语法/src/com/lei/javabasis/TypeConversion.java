package com.lei.javabasis;

public class TypeConversion {
public static void main(String[] args) {
	int a=1000;
	char A='A';
	//String s="hello word";
	short xs=12;
	float f=12.9f;
	double d=12.1212d;
	//boolean b=true;
	byte y=123;
	long l=121211112112123123l;
	System.out.println("累加byte等于："+y);
	System.out.println("累加char等于"+(y+A));
	System.out.println("累加short等于："+(y+A+xs));
	System.out.println("累加int等于："+(y+A+xs+a));
	System.out.println("累加long等于："+(y+A+xs+a+l));
	System.out.println("累加float等于："+(y+A+xs+a+l+f));
	System.out.println("累加double等于："+(y+A+xs+a+l+f+d));
	System.out.println("long强转int,int:"+(int)l);
}
}
