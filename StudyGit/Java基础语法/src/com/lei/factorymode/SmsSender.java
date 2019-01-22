package com.lei.factorymode;

public class SmsSender implements Sender {
//接口实现短信类
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}

}
