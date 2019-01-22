package com.lei.data;


	class EnemyHeroIsDeadException extends Exception{
		public EnemyHeroIsDeadException() {
			
		}
		public EnemyHeroIsDeadException(String msg) {
			super(msg);
		}
	
public static void main(String[] args)  {
DataTest dt1=new DataTest();
dt1.name="典韦";
dt1.hp=4000;
DataTest dt=new DataTest();
dt.name="提莫";
dt.hp=4000;
try {
	dt1.attackHero(dt);
} catch (Exception e) {
System.out.println("异常原因"+e.getMessage());
e.printStackTrace();
}
}
}

