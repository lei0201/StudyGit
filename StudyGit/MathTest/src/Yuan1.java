

import java.util.Scanner;

public class Yuan1 {
public static void main(String[] args) {
System.out.println("请输入圆的半径");
Scanner sc=new Scanner(System.in);
int radius=sc.nextInt();
paint(radius);
}
public static void paint(int r) {
	int y=r*2;
	int x=0;
	int c=0;
	int z=2;
	for(int j=r*2;j>=0;j=j-z) {
		x=getX( r, y);
		System.out.print(Space(x)+"*");
		c=(r-x)*2;
		System.out.println(Space(c)+"*");
		y-=z;		
	}
	
	}

public static int getX(int r,int y) {
	 int x=y-r;	
	return (int)Math.round(r-Math.sqrt((r*r)-(x*x)));
}
public static String Space(int c) {
	String space="";
	for(int m=0;m<c;m++) {
		space+=" ";
	}
	return space;
}
}
