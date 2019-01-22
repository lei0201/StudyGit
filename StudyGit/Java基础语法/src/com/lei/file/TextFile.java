package com.lei.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextFile {
public static void main(String[] args) throws IOException {
	File f=new File("F:\\1.gif");
	System.out.println("文件位置是："+f);
	System.out.println("判断文件是否存在："+f.exists());
	System.out.println("判断是否是文件夹："+f.isDirectory());
	System.out.println("判断是否为文件："+f.isFile());
	System.out.println("获取文件长度："+f.length());
	long time=f.lastModified();
	Date d=new Date(time);
	SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	System.out.println("文件修改时间："+d.toString());
	File f2=new File("F:\\\\2.gif");
	f.renameTo(f2);
	System.out.println("文件改名为2.gif");
	f.list();
	// 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
	File[]fs=f.listFiles();
	// 以字符串形式返回获取所在文件夹
	f.getPath();
	// 以文件形式返回获取所在文件夹
	f.getParentFile();
	 // 创建文件夹，如果父文件夹skin不存在，创建就无效
	f.mkdir();
	// 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
	f.mkdirs();
	// 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
	f.createNewFile();
	// 所以创建一个空文件之前，通常都会创建父目录
	f.getParentFile().mkdirs();
	// 列出所有的盘符c: d: e: 等等
	f.listRoots();
	// 刪除文件
	f.delete();
	 // JVM结束的时候，刪除文件，常用于临时文件的删除
	f.deleteOnExit();
	
}
}
