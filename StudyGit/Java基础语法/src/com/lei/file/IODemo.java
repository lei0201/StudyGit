package com.lei.file;

import java.io.File;

public class IODemo {
	public static void main(String[] args) {
		File f=new File("F:\\迅雷下载");
		System.out.println("此文件夹是否存在："+f.exists());
		File[] files=f.listFiles();
		int max_length=100;
		int min_length=0;
		String max_length_name = null;
		String min_length_name = null;
		for(File file:files) {
			if(file.isFile()) {
				System.out.println(file+" ");
				if(file.length()>max_length) {
					max_length=(int) file.length();
					max_length_name=file.getAbsolutePath();
					}
				if(file.length()>0&&file.length()<min_length) {
					min_length=(int) file.length();
					min_length_name=file.getAbsolutePath();
				}
			}
		}
		System.out.println("最大的文件是："+max_length_name+"，其大小"
				+ "是："+f.length()+"字节，最小文件是："+min_length_name+"其字节数是："
				+min_length);
	}
}
