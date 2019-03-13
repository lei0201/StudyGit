package com.lei.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestSystem {
	public static void main(String[] args) {
		String localChartSet = System.getProperty("file.encoding"); 
		   System.out.println("localChartSet>>>>"+localChartSet);   //查看本地默认字符集

		try {
		File f=new File("C:\\Users\\Administrator\\Desktop\\1.txt");
		FileInputStream fis=new FileInputStream(f);
		byte []all=new byte[(int) f.length()];
		fis.read(all);
		//new String(all,,"gb2312")把all整型数组转换为字符串,"gb2312"字符编码
		System.out.println(new String(all,"utf-8"));
		FileOutputStream  fo=new FileOutputStream(f);
		byte []d= {12,120};
		fo.write(d);
		fis.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
