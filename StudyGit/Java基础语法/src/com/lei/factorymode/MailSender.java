package com.lei.factorymode;

public class MailSender implements Sender {
//接口实现邮件类
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
		
	}

}
