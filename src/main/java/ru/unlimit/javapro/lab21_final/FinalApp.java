package ru.unlimit.javapro.lab21_final;

class B{
	String field="default";
}

class A{
	final int i;
	final B b=new B();
	int j;
	public A(int value){
		i=value;
	}
}

public class FinalApp {
	
	public static void main(String[] args) {
		//Ключевое слово final - Часть 1

		A a=new A(10);
//		a.b.field="new";
//		System.out.println(a.b.field);
		
		int i=6;
		func(a);
	}
	public static void func(final A ref){
		//val=val+1;
		ref.j=77;
		System.out.println();
	}
}
