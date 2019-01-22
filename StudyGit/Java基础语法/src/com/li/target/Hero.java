package com.li.target;

public class Hero {

String name; //姓名

float hp; //血量
float b;//回复血量
float armor; //护甲
 
int moveSpeed; //移动速度

public Hero(String name, float hp, float b, float armor, int moveSpeed) {
	this.name = name;
	this.hp = hp;
	this.b = b;
	this.armor = armor;
	this.moveSpeed = moveSpeed;
}
void legendary() {//超神
	 System.out.println("你超神了");
}
float getHp() {
	System.out.println("血量"+hp);
	return hp;
}
float recovery(float b){
	System.out.println("血量"+(hp+b));
return hp+b;	
}
public static void main(String[] args) {
	Hero hero=new Hero("亚瑟", 1000, 100, 500, 350);
	hero.legendary();
	hero.getHp();
	hero.recovery(hero.b);
}
}
