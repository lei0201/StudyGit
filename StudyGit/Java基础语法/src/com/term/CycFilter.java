package com.term;

public class CycFilter {
public static void main(String[] args) {
	String []str={"秃鹫","苍鹭"," 白鹭", "雁", "野鸭","苍鹰", "野鸡", "斑鸠", "野鸽子", "苍鹰", "麻雀"};
	int coun=0;
	for(String a:str) {
		if(a.equals("苍鹰")) {
			coun++;
			continue;		
		}else {System.out.println(a);}
	}
	System.out.println("一共有"+coun+"只老鹰");
}
}
