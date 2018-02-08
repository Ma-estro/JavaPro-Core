package ru.unlimit.javapro.lab24_overriding;

public class AbstractApp {

	public static void main(String[] args) {
		
		A a = new B();
		
		print(a);
		
		
		
	}
	public static void print(A ref){
		ref.print();
	}
}

class A{
	void print(){
		System.out.println("Я есть A");
	}
}
class B extends A{
	void print(){
		System.out.println("Я есть B");
	}	
}
class C extends A{
	void print(){
		System.out.println("Я есть C");
	}	
}