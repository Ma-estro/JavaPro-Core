package ru.unlimit.javapro.lab28.stuffClasses;

public class App {

	public static void main(String[] args) {
		
		//модификаторы доступа применяются к методам
		//private поля и методы не наследуются
		//this.method()
		//super.method()
		//final class - запрет наследования
		//nested-классы
			//inner-классы
			//static nested классы
		
		A a = new A();
		A.B b = a.new B();
		
		A.C c = new A.C();
	}
}
class A{
	class B{
		
	}
	static class C{
		
	}
}
