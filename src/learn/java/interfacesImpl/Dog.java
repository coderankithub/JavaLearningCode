package learn.java.interfacesImpl;

import learn.java.interfaces.Animal;

public class Dog implements Animal {
	
	public void eat() {
		System.out.print("Dog can eat");
	}
	
	public void sleep() {
		System.out.print("Dog can sleep");
	}
	
	public void bark() {
		System.out.print("Dog brak");
	}
}
