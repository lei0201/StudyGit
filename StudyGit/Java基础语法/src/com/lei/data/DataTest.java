package com.lei.data;

public class DataTest {
	public String name;
	protected int hp;
	public void attackHero(DataTest h)throws EnemyHeroIsDeadException {
		if(h.hp==0) {
			throw new EnemyHeroIsDeadException(h.name+"已经挂了，不需要释放技能了。");
		}
		}
	public String toString() {
		return name;
	}
	}
 
