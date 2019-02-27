package com.lei.singletonpattern;

public class Singleton {
	/*私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载*/
	//private static Singleton instance=null;
	/*私有构造方法，防止被实例化*/
	private Singleton() {
	
	}
	/**懒汉单例模式
	 * 静态工程方法，创建实例，此类无线程安全保护
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}*/
	/**
	 *静态工程方法，创建实例，加入线程保护synchronized关键词
	 * 
	
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	} */
	/**
	 * 双重检查锁定
	 * 
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
				
			}
			
		}return instance;
	} */
	/**
	 * 静态内部类
	 * 
	 */
	private static class SingletonFactory {
		private static Singleton instance=new Singleton();
			}
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}
	
	/*如果该对象被用于序列化，可以保证对象在序列化前后保持一致*/
	public Object readResolve() {
		//return instance;
		return SingletonFactory.instance;
	}
}
