package ArrayDrill;

import java.util.Scanner;
/**
 * 练习题：雯波那锲数列是由1、1、2、3、5、8、13、21、34等等组成
 * 其中每个数都是前两个数之和
 * @author Administrator
 *int b是雯波那锲数组的元素个数
 *int a[]是雯波那锲数组
 */
public class Fibonacci {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("请输入雯波那锲数组的个数：");
		int b=sc.nextInt();
		 int a[]=new int[b];
		 for(int i=0; i<b;i++) {
			 if(i<2) {
				 a[i]=1;
			 }
			 if(i>=2) {
				 a[i]=a[i-1]+a[i-2];
			 }
			 System.out.println(a[i]);
		 }
		
	}
	
	

}
