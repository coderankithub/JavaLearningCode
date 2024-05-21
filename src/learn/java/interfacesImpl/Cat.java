package learn.java.interfacesImpl;

import learn.java.interfaces.Animal;

public class Cat implements Animal{
	
	final static int leg;
	
	static {
		leg = 2;
	}
		
	public void eat() {
		System.out.print("Cat can eat");
	}
	
	public void sleep() {
		System.out.print("Cat can sleep");
	}
	
	public void meow() {
		System.out.print("Cat does Meow");
	}
	
}
