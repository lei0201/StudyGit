package com.lei.charactor;


public class AdApHero extends com.li.target.Hero implements Healer {

	public AdApHero(String name, float hp, float b, float armor, int moveSpeed) {
		super(name, hp, b, armor, moveSpeed);
		
		
	}

	@Override
	public void heal() {
		System.out.println("治疗英雄");
		
	}

}
