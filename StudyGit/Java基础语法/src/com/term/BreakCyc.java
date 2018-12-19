package com.term;
//主要考察break中断循环
public class BreakCyc {
	public static void main(String[] args) {
		System.out.println("在苍鹰之前有哪些鸟类：");
		String []str={"秃鹫","苍鹭"," 白鹭", "雁", "野鸭","苍鹰", "野鸡", "斑鸠", "野鸽子", "雀", "麻雀"};
		for(String s : str){
			if(s.equals("苍鹰")) {
				break;
			}else {
				System.out.println(s);	
				}
		}
		System.out.println("******间隔线********");
		int [][]score= {{67,67,78,98,100},{65,76,56,78,56},{12,34,76,78,67}};//创建二维数组
		LEI10:for(int[]is:score) {
			for(int i:is) {
				if(i>60) {System.out.println(i);}else {					
					System.out.println("嗯哼，这是那门科目怎么才"+i+"分，有不及格了");
					break LEI10;
				}
				
			}
		}
	}

}
