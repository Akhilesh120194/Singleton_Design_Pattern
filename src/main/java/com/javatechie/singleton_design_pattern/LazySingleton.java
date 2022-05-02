package com.javatechie.singleton_design_pattern;

public class LazySingleton {

	private LazySingleton() {
	}

	private static LazySingleton instance;

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			System.out.println("Instance Created");
			return instance = new LazySingleton();//2 object by 2 thread
		} else {
			return instance;
		}
	}

}
