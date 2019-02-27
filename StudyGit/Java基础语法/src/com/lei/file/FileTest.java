package com.lei.file;



	import java.io.File;
	import java.io.IOException;
	import java.util.Date;  //获取时间

	/*作者 ： ***
	 *知识点：文件对象
	 *1、创建一个路径
	 * 时间：2017.12.07
	 * */
	public class FileTest {
	 
		  private static long maxLength = 0;
		    private static long minLength = Integer.MAX_VALUE;
		    private static File maxFile = null;
		    private static File minFile = null;
		    private static int maxDepth = Integer.MAX_VALUE;// 最大遍历深度()
		 
		    private static void listFiles(File file, int depth) {
		        if (depth > maxDepth) {
		            return;
		        }
		        if (file.isFile()) { 
		        	System.out.println(file.getAbsolutePath()+",\t"+file.length());
		            if (file.length() > maxLength) {
		                maxLength = file.length();
		                maxFile = file;
		            }
		            if (file.length() != 0 && file.length() < minLength) {
		                minLength = file.length();
		                minFile = file;
		            }
		            return;
		        }
		        if (file.isDirectory()) {
		        	
		            File[] fs = file.listFiles();
		            if (fs == null) {
		                return;
		            }
		            for (File f : fs) {
		                listFiles(f, depth + 1);
		               // System.out.println(f.getAbsolutePath()+",\t"+f.length());
		                
		            }
		        }
		        
		    }
		 
		    public static void main(String[] args) {
		        File f = new File("c:\\windows");
		        listFiles(f, 1);
		        System.out.printf("最大的文件是:%s,文件大小:%d %n", maxFile.getAbsoluteFile(), maxFile.length());
		        System.out.printf("最小的文件是:%s,文件大小:%d %n", minFile.getAbsoluteFile(), minFile.length());
		 
		    }
		}