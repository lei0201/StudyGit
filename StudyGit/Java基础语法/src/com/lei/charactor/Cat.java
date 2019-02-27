package com.lei.charactor;
/**
 * 
 * @author Administrator
 *	1. 该类必须包含String属性来存宠物的名字。
	2. 定义一个构造器，它使用String参数指定猫的名字；该构造器必须调用超类构造器来指明所有的猫都是四条腿。
	3. 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
	4. 实现Pet接口方法。
	5. 实现eat方法。
 */
public class Cat extends Animal implements Pet {

private String name;
	
	protected Cat(int a) {
		super(3);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("小猫在吃鱼。");
	}

	@Override
	public void getName() {
		System.out.println("宠物名字为："+name);
		
	}

	@Override
	public void setName(String name) {
		
		this.name=name;
		System.out.println("取名为："+name);
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("小猫在玩耍");
	}

}
