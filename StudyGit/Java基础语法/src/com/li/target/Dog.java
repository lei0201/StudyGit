package com.li.target;

public class Dog {
	
public void bark(String barking,String howling) {
	System.out.println("小花狗"+barking+"的吠"+howling+"的咆哮");
	
}
public void bark(int barking,String howling) {
	System.out.println("小花狗"+barking+"的吠"+howling+"的咆哮");
	
}
public void bark(long barking,String howling) {
	System.out.println("小花狗"+barking+"的吠"+howling+"的咆哮");
	
}
public void bark(String barking,int howling) {
	System.out.println("小花狗"+barking+"的吠"+howling+"的咆哮");
	
}
public static void main(String[] args) {
	Dog d=new Dog();
	d.bark("汪——", "獒！獒！");
	d.bark(1, "獒！獒！");
	d.bark(123112, "獒！獒！");
	d.bark("呜——", "21");
}

}
