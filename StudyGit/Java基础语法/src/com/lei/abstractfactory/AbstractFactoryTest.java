package com.lei.abstractfactory;
/**
 * 抽象工厂模式
 * 测试类
 * 创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码
 * @author Administrator
 *
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		Provider provider=new SendMailFactory();
		Sender sender=provider.produce();
		sender.Send();
	}
}
