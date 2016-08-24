package com.neo.singleton;
/**
 *
 * @author lile
 * @date   2016年8月24日 
 */
public class SingletonTest {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("myThread1");
		MyThread myThread2 = new MyThread("myThread2");
		MyThread myThread3 = new MyThread("myThread3");
		
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		Thread thread3 = new Thread(myThread3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

