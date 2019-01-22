package com.lei.abstractfactory;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MaliSender();
	}

}
