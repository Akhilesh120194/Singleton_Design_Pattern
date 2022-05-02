package com.javatechie.singleton_design_pattern;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		/*
		 * LazzyInnerClassSingleton obj1 =
		 * LazzyInnerClassSingleton.getInstance();
		 * 
		 * System.out.println(obj1.hashCode());
		 * 
		 * LazzyInnerClassSingleton obj2 =
		 * LazzyInnerClassSingleton.getInstance();
		 * 
		 * System.out.println(obj2.hashCode());
		 */

		Thread t1 = new Thread(new Runnable() {

			public void run() {
			LazySingleton lg1=	LazySingleton.getInstance();
				
			//	EagerSingleton eg1=EagerSingleton.getInstance();
				System.out.println(lg1.hashCode());

			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				LazySingleton lg1=	LazySingleton.getInstance();
			//	EagerSingleton eg2=EagerSingleton.getInstance();
				System.out.println(lg1.hashCode());

			}
		});
		t1.start();
		t2.start();

	}
}
