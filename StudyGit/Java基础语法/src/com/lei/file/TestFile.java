package com.lei.file;

import java.io.File;

public class TestFile {
	static long minSize=Integer.MAX_VALUE;
	static long maxSize=0;
	static File minFile=null;
	static File maxFile=null;
	public static void listFiles(File file) {
		if(file.isFile()) {
			if (file.length()>maxSize) {
				maxSize=file.length();
				maxFile=file;
				
			}
			if(file.length()>0&&file.length()<minSize) {
				minSize=file.length();
				minFile=file;
			}
			return;
		}
		if (file.isDirectory()) {
			File []fs=file.listFiles();
			if(null!=fs)
				for (File f:fs) {
					listFiles(f);
				}
			}
	}
	public static void main(String[] srgs) {
		File f=new File("F:\\迅雷下载");
		listFiles(f);
		System.out.printf("最大的文件是%s，其大小是%,d字节%n",maxFile.getAbsolutePath(),maxFile.length());
		System.out.printf("最小的文件是%s，其大小是%,d字节%n",minFile.getAbsolutePath(),minFile.length());
	}
}
