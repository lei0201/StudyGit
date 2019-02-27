package com.lei.file;

import java.io.File;

public class FileTest1 {
	static long maxLength = 0;// 最大文件的长度
	static long minLength = Integer.MAX_VALUE;// 最小文件的长度
	static File maxFile = null;// 最大文件
	static File minFile = null;// 最小文件
	static int maxCount = Byte.MAX_VALUE;// 遍历文件夹的子文件的最大次数

	public static void FileList(File f, int count) {
		if (count > maxCount) {
			return;
		}
		if (f.isFile()) {
			if (f.length() > maxLength) {
				maxLength = f.length();
				maxFile = f;
			}
			if (f.length() < minLength && f.length() != 0) {
				minLength = f.length();
				minFile = f;
			}
			return;
		}
		if (f.isDirectory()) {
			File[] fs = f.listFiles();
			if (fs == null) {
				return;
			}
			for (File file : fs) {
				FileList(file, count + 1);
			}

		}

	}

	public static void main(String[] args) {
		File f = new File("c:\\windows");
		FileList(f, 1);
		System.out.printf("最大文件为：%s \t的大小为：%d%n" ,maxFile, maxLength);
		System.out.printf("最小文件为：%s \t的大小为：%d",minFile, minLength);

	}

}
