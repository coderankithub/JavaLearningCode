package learn.java;

import learn.java.interfaces.Animal;
import learn.java.interfacesImpl.Cat;
import learn.java.interfacesImpl.Dog;

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
		
		// we can't create objects of and interface 
		// means we can't use new keyword to create object on an interface
		// both are valid 
		Animal object2 = new Dog(); 
		Dog object3 = new Dog();
		
		Animal Ob = new Cat();
	
		object2.eat();
		System.out.println();
		Ob.eat();
		System.out.println();
		object3.bark();
		object3.eat();
		System.out.println();
	}
	
	 void fun() {
		System.out.println("My First Funtion.");
	}
	
}



