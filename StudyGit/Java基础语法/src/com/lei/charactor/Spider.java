package com.lei.charactor;
/**
 * 
 * @author Administrator
 * 1. Spider继承Animal类。
   2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
   3. 实现eat方法
 */
public class Spider extends Animal {
	
	protected Spider(int a) {
		super(8);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃呀吃呀吃。");
	}

}
