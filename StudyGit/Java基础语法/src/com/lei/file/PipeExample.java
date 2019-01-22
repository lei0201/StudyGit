package com.lei.file;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeExample {
	public static void main(String[] args) throws IOException {
		final PipedOutputStream output=new PipedOutputStream();
		final PipedInputStream input=new PipedInputStream(output);
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					output.write("hello world,pipe".getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						output.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
				
			}
		});
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					int data=input.read();
					while(data !=-1) {
						System.out.println((char)data);
						data= input.read();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						input.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		});
		thread1.start();
		thread2.start();
//		input.close();
//		output.close();
	}

}
