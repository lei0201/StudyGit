package com.lei.cover;

public class ADHero extends Hero implements Mortal {
	String name;
	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println(name+"ad英雄"+getName()+"gg");
	}

	

}
