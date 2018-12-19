package ArrayDrill;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Administrator
 *这个类判断输入的数字是否出现在数组里
 *Arrays.sort(要排序的数组名) java工具包的Arrays类的sort方法是让数组元素从小到大排序
 *Arrays.binarySearch（数组，查找值）
 */
public class Dichotomy {
public static void main(String[] args) {
	int a[]= {21,32,12,33,15,87,90,65,97,54,56,34,67};
	int n=1;
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	while(n==1) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入整数，判断数组内是否包含：");
		int number=sc.nextInt();
		int i=Arrays.binarySearch(a, number);
		
		if(i>=0) {
			System.out.println(number+"和数组索引为"+i+"的数字相同");
			
		}else {
			System.out.println(number+"不和数组里的元素相同");
		}
		System.out.println("输入1继续，输入0结束");
		n=sc.nextInt();
	}
}

}
