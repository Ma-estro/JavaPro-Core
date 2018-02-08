package ru.unlimit.javapro.lab27.initializeClass;

public class Initializing {

	
	public static void main(String[] args) throws ClassNotFoundException{
		
		//Инициализация и загрузка классов
		
		System.out.println(A.st);
		//A a = new A();
		
		//B b = new B();
	}

}

class A{
	public A(){
		System.out.println("Конструктор A()");
	}
	String strA;
	int intA;
	{
		System.out.println("Анонимный блок A");
		System.out.println("strA = " + strA);
		System.out.println("intA = " + intA);
		strA="default";
		intA=6;
		System.out.println("strA = " + strA);
		System.out.println("intA = " + intA);
		
	}

	
	static String st="static field";
	static{
		System.out.println("Статический блок A");
		st="new static field";
	}
}

class B extends A{
	String strB;
	int intB;
	{
		System.out.println("Анонимный блок B");
		System.out.println("strB = " + strB);
		System.out.println("intB = " + intB);
		strB="default";
		intB=100;
		System.out.println("strB = " + strB);
		System.out.println("intB = " + intB);
		
	}
	
	static String st="static field";
	static{
		System.out.println("Статический блок B");
		st="new static field";
	}
	public B(){
		System.out.println("Конструктор B()");
	}
}