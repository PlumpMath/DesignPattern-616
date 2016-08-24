package com.neo.singleton;
/**
 * double checked locking pattern
 * @author lile
 * @date   2016年8月24日
 */
public class DCLockSynSingleton {
	private /*volatile*/ static DCLockSynSingleton instance;
	private DCLockSynSingleton(){

	}
	/**
	 * the lazy pattern,but the instance is checked twice 
	 * @return
	 */
	public static synchronized DCLockSynSingleton getInstance(){
		if(instance == null){							//single check
			synchronized (DCLockSynSingleton.class){
				if(instance == null){
					instance = new DCLockSynSingleton();//double check
				}
			}
		}
		return instance;
	}
}

