package com.lei.cover;

public class test {
	public static void main(String[] args) {
		Hero ys=new Hero();
		ys.setName("亚瑟");
		ADHero jl=new ADHero();
		jl.setName("伽罗");
		ADAPHero gb=new ADAPHero();
		gb.setName("宫本");
		APHero zl=new APHero();
		zl.setName("张良");	
		ys.kill(jl);
	}

}
