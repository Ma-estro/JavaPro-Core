package ru.unlimit.javapro.lab26_interface;

public class InterfaceApp {

	public static void main(String[] args) {
		I i = new A();
		i.Default();
		i.f();
	}
}

interface I{
	int a=5;
	void f();
	String str();
	default void Default(){
		System.out.println("Default interface method");
	}
}

interface J{
	void print();
}

interface K extends J{
	void L();
}

class B implements K{

	@Override
	public void print() {
		
	}

	@Override
	public void L() {
		
	}
	
}

class A implements I,J{

	@Override
	public void Default() {
		System.out.println("Default in A class");
	}

	@Override
	public void f() {
		System.out.println("f()");
	}

	@Override
	public String str() {
		return null;
	}

	@Override
	public void print() {
		
	}
}