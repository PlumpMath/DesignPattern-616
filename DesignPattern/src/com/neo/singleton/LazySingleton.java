package com.neo.singleton;
/**
 * 懒汉式，就是在需要的时候才创建，需要返回单例对象的时候，咦，还没有啊，那我创建一个
 * @author lile
 * @date   2016年8月24日
 */
public class LazySingleton {
	private static LazySingleton instance;
	private LazySingleton(){
		
	}
	public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}

