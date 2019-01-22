package com.lei.factorymode;
//
public class SendFactory {
	/**
	   * 普通工厂模式的工厂类
	 * @param type
	 * @return
	 * public Sender produce(String type) {
		if("mail".equals(type)) {
			return new MailSender();
		}
		if("sms".equals(type)) {
			return new SmsSender();
		}
		else {
			System.out.println("没有此类哦。");
			return null;
		}
		
	}
	 */

	/**
	   *  多个工厂方法模式的工厂类
	
	public Sender produceMail(){
		
		return new MailSender() ;
		
	}
	public Sender produceSms() {
		return new SmsSender();
	}
	 */

	/**
	 * 静态工厂方法模式的工厂类
	 * @return
	 */
		public static Sender produceMail() {
			return new MailSender();
		}
		public static Sender produceSms() {
			return new MailSender();
		}
	
}
