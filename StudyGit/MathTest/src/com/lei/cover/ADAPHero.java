package com.lei.cover;

public class ADAPHero extends Hero implements Mortal {
	String name;
	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println(name+"ADAPHero"+getName()+"gg");
	}

	
}
