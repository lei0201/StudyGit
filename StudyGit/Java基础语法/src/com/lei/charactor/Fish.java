package com.lei.charactor;
/**
 * 
 * @author Administrator
 *1. 创建Fish类，它继承Animal类
2. 重写Animal的walk方法以表明鱼不能走且没有腿。
3. 实现Pet接口
4. 无参构造方法
5. 提供一个private 的name属性
 */
public class Fish extends Animal implements Pet{
	private String name;
	protected Fish(int a) {
		super(0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void eat() {
		System.out.println("鱼吃虾米");
		
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("小鱼名字为："+name);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("小鱼在游玩");
	}
	public void walk() {
		System.out.println(name+"是不能行走的，腿的数目："+legs);
	}
}
