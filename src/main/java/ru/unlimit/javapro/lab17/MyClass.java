package ru.unlimit.javapro.lab17;


public class MyClass {

	public MyClass(){
		System.out.println("Конструктор без аргументов");
	}
	
	public MyClass(String s){
		System.out.println("Конструктор с аргументом "+s);
	}
	
	private int field=100;
	
	public void func(){
		System.out.println("I'm func() with field "+field);
	}
	
	public int abs(int value){
		return value<0 ? -value : value;
	}
}
