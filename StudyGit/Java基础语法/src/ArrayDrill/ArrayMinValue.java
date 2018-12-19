package ArrayDrill;
import java.util.Scanner;
public class ArrayMinValue {
	public static void main(String[] args) {
		int[]a=new int[3] ;
		for(int i=0;i<a.length;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第"+i+1+"数字：");
			a[i]=sc.nextInt();			
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			if(a[i]>a[j]) {
				a[i]=a[i]^a[j];
				a[j]=a[j]^a[i];
				a[i]=a[i]^a[j];
			}
			}
			}
			for(int i:a) {
			System.out.print(i+"\t");	
		}
		
	}
	

}
