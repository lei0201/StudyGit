package com.lei.cover;

public class Hero{
	String name;
	
	public void  kill(Mortal m) {
		m.die();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
