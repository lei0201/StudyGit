package com.lei.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest {
	/**
	 * 解密在文件加密中生成的文件。
	设计一个方法 
	public static void decodeFile(File decodingFile, File decodedFile);
	在这个方法中把decodingFile的内容进行解密，然后保存到decodedFile文件中。
	解密算法： 
	数字：
	如果不是0的数字，在原来的基础上减1，比如6变成5, 4变成3
	如果是0的数字，变成9
	字母字符：
	如果是非a字符，向左移动一个，比如e变成d, H变成G
	如果是a，a->z, A-Z。
	字符需要保留大小写
	非字母字符：
	比如',&^ 保留不变，中文也保留不变
	 */
	public static void decodeFile( File decodedFile,File decodingFile) {
		try (FileReader fr=new FileReader(decodedFile); FileWriter fw=new FileWriter(decodingFile)){
			char[]fileContent=new char[(int) decodedFile.length()];
			fr.read(fileContent);
			System.out.println("源文件：");
			//System.out.println(fileContent);
			decode(fileContent);
			System.out.println("加密文件");
			fw.write(fileContent);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 private static void decode(char[] fileContent) {
		 for(int i=0;i<fileContent.length;i++) {
			 if(isLetterOrDigit(fileContent[i])) {
				 switch (fileContent[i]) {
				case '0':
					fileContent[i]='9';
					break;
				case 'a':
					fileContent[i]='z';
					break;
				case 'A':
					fileContent[i]='Z';
					break;

				default:
					fileContent[i]--;
					break;
				}
			 }
		 }
	 }
	 public static boolean isLetterOrDigit(char c) {
	        // 不使用Character类的isLetterOrDigit方法是因为，中文也会被判断为字母
	        String letterOrDigital ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	        return -1 == letterOrDigital.indexOf(c) ? false : true;
	    }
	public static void main(String[] args) {		
		File decodedFile=new File("C:\\Users\\Administrator\\Desktop\\Test1.txt");
		File decodingFile=new File("C:\\Users\\Administrator\\Desktop\\Test2.txt");
		decodeFile(decodedFile, decodingFile);
	}

}
