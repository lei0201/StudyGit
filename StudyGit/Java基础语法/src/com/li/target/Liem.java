package com.li.target;

public class Liem {
	String name;//英雄名字
	int mortality;//死亡数
	int kills;//杀人数
	int assisting;//助攻数
	
	public Liem(String name, int mortality, int kills, int assisting) {//有参构造方法
		this.name = name;
		this.mortality = mortality;
		this.kills = kills;
		this.assisting = assisting;
	}
	
	@Override
	public String toString() {
		return "Liem [name=" + name + ", mortality=" + mortality + ", kills=" + kills + ", assisting=" + assisting
				+ "]";
	}

	public static void main(String[]arge ) {
		Liem li=new Liem("亚瑟", 20, 0, 29);
		System.out.println(li.toString());
	
	}	
	

}
