package com.lei.cover;

public class APHero extends Hero implements Mortal {
	String name;
	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("APHero"+getName()+"gg");
	}

	
}
