package com.li.target;
import java.util.Scanner;
public class StorageRoom {
	public void cx(String st) {
		switch (st) {
		case "自行车":
			System.out.println("自行车存货量：");
			break;
		case "电风扇":
			System.out.println("电风扇存货量：");
			break;
		case "电视机":
			System.out.println("电视机存货量：");
			break;
		case "空调":
			System.out.println("空调存货量：");
			break;
		case "洗衣机":
			System.out.println("洗衣机存货量：");
			break;
		case "微波炉":
			System.out.println("微波炉存货量：");
			break;

		default:System.out.println("没有此商品");
			break;
		}
	}
	public static void main(String[] args) {
		System.out.println("*****储物室信息查询***** ");
		System.out.println("请输入物品名称：");
		Scanner sc=new Scanner(System.in);
		String wp=sc.nextLine();
		
		
	}
}
