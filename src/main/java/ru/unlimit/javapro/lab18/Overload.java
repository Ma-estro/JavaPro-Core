package ru.unlimit.javapro.lab18;

class Point {
	int x;
	int y;
	int z;
	
	public Point(){}
	public Point(int value){
		x=value;
		y=value;
		z=value;
	}
	public Point(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void print(){
		System.out.println("Point: {x="+x+", y="+y+", z="+z+"}");
	}
}

public class Overload {

	public static void print(){
		System.out.println("Печатаем print()");
	}
	
	public static void print(String s){
		System.out.println("Печатаем print(String s), s="+s);
	}
	public static void main(String[] args) {
		//Перегрузка методов
//		print("привет");
		Multiply m=new Multiply();
		
//		System.out.println(m.mult(2,3,4));
//		m.mult(5, 4, -6);
//		System.out.println(m.mult(123.12));
//		System.out.println(m.mult(555));
		
//		Point p=new Point(117,11,-4);
//		p.print();
		
		System.out.println(m.mult());
		
	}

}
