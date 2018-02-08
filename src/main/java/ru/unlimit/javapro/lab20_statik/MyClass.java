package ru.unlimit.javapro.lab20_statik;

class A{
	static int field;
	
	static{
		field=100;
	}
	
	static void setField(int value){
		field=value;
	}
}

public class MyClass {

	public static void main(String[] args) {
		//Статические поля и методы класса

		//A.field=1;
		
		A a1=new A();
		//a1.field=2;
		
		A a2=new A();
		//a2.field=3;
		
		//a1.setField(7);
		
		System.out.println(A.field);
		System.out.println(a1.field);
		System.out.println(a2.field);
	}
}
