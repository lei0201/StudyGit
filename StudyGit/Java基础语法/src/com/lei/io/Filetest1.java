package com.lei.io;

import java.io.File;
import java.util.Arrays;

public class Filetest1 {
	static File fstandard = new File("c:/windows/system.ini");
    static File[] allmaxmin = new File[2];
     
    public static void main(String args[]) {
        File f1= new File ("C:/windows");             //绝对路径
        allmaxmin[0]=allmaxmin[1]=fstandard;
        System.out.println("存在？"+fstandard.exists());
        Filetest1 f =new Filetest1();
        f.sort(f1);
    }
    public String traversal(File f) {
        File[] fs = f.listFiles();
        String FileList = Arrays.toString(fs);
        return FileList;
    }
    public void sort(File f) {
        if(f.length()==0&&f.isDirectory()) {
            //System.out.println("此文件夹为空:"+f.getName());
            return;
        }
         
     
        File[] fs = f.listFiles();
        if(fs==null) {
            System.out.println("无权访问此文件夹"+f.getName());
            return;
        }
         
        File[] maxmin = new File[2];
        maxmin[0]=maxmin[1]=fstandard;//new 两个数组，将最大值填入第一个，最小值填入第二个
        for(int i=0;i<fs.length;i++) {
            if(fs[i].isDirectory()) {
                sort(fs[i]);
            }
            if(fs[i].length()>maxmin[0].length()&&fs[i].length()!= 0&&fs[i].isFile()) {
                maxmin[0]=fs[i];
            }
            if(fs[i].length()<maxmin[1].length()&&fs[i].length()!= 0&&fs[i].isFile()) {
                maxmin[1]=fs[i];
            }
            if(maxmin[0].length()>allmaxmin[0].length()) {
            allmaxmin[0]=maxmin[0];
            }if(maxmin[1].length()<allmaxmin[1].length())
            allmaxmin[1]=maxmin[1];
             
        }
//        System.out.println("最大的文件为"+maxmin[0]+"文件长度为"+maxmin[0].length()); 
//        System.out.println("最小的文件为"+maxmin[1]+"文件长度为"+maxmin[1].length());
          System.out.println("文件夹名为"+maxmin[0].getParent());
          System.out.println("该文件夹最大的文件长度为"+allmaxmin[0].length()+"文件名为"+allmaxmin[0].getName());
          System.out.println("该文件夹最小的文件长度为"+allmaxmin[1].length()+"文件名为"+allmaxmin[1].getName());
    }
}
