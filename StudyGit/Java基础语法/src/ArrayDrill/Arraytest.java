package ArrayDrill;

public class Arraytest {
	//数组二维数组行列互换
	public static void main(String[] args) {
		int [][] arr=new int[][]{{1,2,3,},{4,5,6},{7,8,9}};
			int[][]arr2=new int [arr.length][arr.length];
			for(int i=0;i<arr.length;i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr2[j][i]=arr[i][j];
					}
								
			}
			System.out.println("行列互换：");
			for(int i=0;i<arr.length;i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr2[i][j]+"\t");
					}
				System.out.println();
	}
			}

}
