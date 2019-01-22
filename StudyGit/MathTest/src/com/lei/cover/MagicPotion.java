package com.lei.cover;

public class MagicPotion extends Item{
	String name;
	int price;
	public void buy() {
		System.out.println("购买蓝瓶");
		
	}
	public void effect(){
		System.out.println("使用蓝瓶，可以回蓝。");
	}
}
