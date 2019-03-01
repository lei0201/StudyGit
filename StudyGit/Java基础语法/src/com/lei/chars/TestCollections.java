package com.lei.chars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**首先初始化一个List,长度是10，值是0-9。
	然后不断的shuffle，直到前3位出现
	3 1 4
	shuffle 1000,000 次，统计出现的概率
*/
public class TestCollections {
	public static void main(String[] args) {
		int count=0;
		List<Integer>num=new ArrayList<>();
		for(int i=0;i<10;i++) {
			num.add(i);
						
		}
		for(int i=0;i<1000000;i++) {
			Collections.shuffle(num);
			if(num.get(0)==3&&num.get(1)==1&&num.get(2)==4) {
				System.out.println(num);
				count++;
			}
			
		}
		System.out.println(count);		
		
	}

}
