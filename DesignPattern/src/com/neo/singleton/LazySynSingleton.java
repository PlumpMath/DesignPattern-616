package com.neo.singleton;
/**
 *
 * @author lile
 * @date   2016年8月24日
 */
public class LazySynSingleton {
	private static LazySynSingleton instance;
	private LazySynSingleton(){
		
	}
	/**
	 * 懒汉式，线程安全
	 * @return
	 */
	public static synchronized LazySynSingleton getInstance(){
		if(instance == null){
			instance = new LazySynSingleton();
		}
		return instance;
	}
}

