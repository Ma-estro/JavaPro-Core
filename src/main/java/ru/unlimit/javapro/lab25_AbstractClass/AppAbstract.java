package ru.unlimit.javapro.lab25_AbstractClass;

public class AppAbstract {

	public static void main(String[] args) {

		Shape square = new Square(4);
		square.area();
		
		Shape rect = new Rectangle(2, 3);
		rect.area();
		
		Shape cicrle = new Cicrle();
		cicrle.area();
		
	}
}

abstract class Shape{
	//abstract void f2();
	
	void area(){
		System.out.println("Площадь для данной фигуры не определена");
	};
	
	String f(){
		return "str";
	};
}

class Square extends Shape{

	int n;
	
	public Square(int n) {
		this.n = n;
	}

	@Override
	void area() {
		System.out.println("Площадь квадрата="+n*n);
	}
}
class Rectangle extends Square{
	
	int m;
	
	public Rectangle(int n, int m) {
		super(n);
		this.m=m;
	}
	
	@Override
	void area() {
		System.out.println("Площадь прямоугольника="+n*m);
	}
}
class Cicrle extends Shape{
	
}
