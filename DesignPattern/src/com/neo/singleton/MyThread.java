package com.neo.singleton;
/**
 *
 * @author lile
 * @date   2016年8月24日
 */
public class MyThread implements Runnable{
	
//	private Singleton singleton;
//	private LazySynSingleton synSingleton;
	private DCLockSynSingleton dcLockSynSingleton;
	private String threadName;
	public MyThread( String threadName){
		this.threadName = threadName;
	}
	@Override
	public void run() {
//		setSingleton(Singleton.getInstance());
//		System.out.println(threadName + " "+singleton.hashCode());
		
//		setSynSingleton(LazySynSingleton.getInstance());
//		System.out.println(threadName + " "+synSingleton.hashCode());
		setDcLockSynSingleton(DCLockSynSingleton.getInstance());
		System.out.println(threadName + " "+dcLockSynSingleton.hashCode());
	}
//	public void setSingleton(Singleton singleton) {
//		this.singleton = singleton;
//	}
//	public void setSynSingleton(LazySynSingleton synSingleton) {
//		this.synSingleton = synSingleton;
//	}
	public void setDcLockSynSingleton(DCLockSynSingleton dcLockSynSingleton) {
		this.dcLockSynSingleton = dcLockSynSingleton;
	}
}

