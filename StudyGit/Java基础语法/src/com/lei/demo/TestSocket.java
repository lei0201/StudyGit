package com.lei.demo;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class TestSocket {
//	public static void main(String[] args)throws IOException {
//		
//		Process p =Runtime.getRuntime().exec("ping"+"192.168.2.106");
//		BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
//		String line =null;
//		StringBuilder sb =new StringBuilder();
//		while ((line =br.readLine())!=null) {
//			if(line.length()!=0)
//				sb.append(line+"\r\n");
//		}
//		System.out.println("本次指令返回的消息是：");
//		System.out.println(sb.toString());
//		
//	}
//	
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class TestSocket {

	public static void main(String[] args) throws IOException {
		 InetAddress host = InetAddress.getLocalHost();
	        String ip =host.getHostAddress();
	        System.out.println("本机ip地址：" + ip);
		Process p = Runtime.getRuntime().exec("ping " + "192.168.6.106");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));
		String line = null;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			if (line.length() != 0)
				sb.append(line + "\r\n");
		}
		System.out.println("本次指令返回的消息是：");
		System.out.println(sb.toString());
	}

}