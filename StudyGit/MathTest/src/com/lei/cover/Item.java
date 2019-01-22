package com.lei.cover;

public class Item {
String name;
int price;
public void buy() {
	System.out.println("可以买东西。");
	
}
public void effect() {
	System.out.println("使用东西，可以获得效果。");
}
public static void main(String[] args) {
	Item it=new Item();
	it.effect();
	MagicPotion ma=new MagicPotion();
			ma.effect();
}
}
