package learn.java;

//import java.lang.System;

public class Main {
	// class level variable 
	// scope class level
	// Initialize by JVM 
	// global variable 
	static int i;
	static String s;
	static  {
		// static blocks
		// these gets executed before main itself 
	}
	
	public static void main(String[] args) {
		// method level or local variable 
		// scope method 
		// they don't initialize by JVM
		int k=0;
		String p="M";
		System.out.println("Hello World");
		System.out.println(i + " " + s);
		System.out.println(k + " " + p);
		// add fun 
		Main object = new Main();
		object.fun();
	}
	
	
	
	 void fun() {
		System.out.println("My First Funtion.");
	}
	
}



