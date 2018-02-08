package ru.unlimit.javapro.lab19;

class Box{
	int x;
	public Box(){
		x=0;
	}
	public Box(int value){
		x=value;
	}
	public void print(){
		System.out.println("Box: {x = "+x+"}");
	}
}

public class MyClass {

	public static void main(String[] args) {
//		int i=10;
//		
//		System.out.println("i="+i);		
//		change_i(i);
//		System.out.println("i="+i);
		
		Box b=new Box();
		b.print();
		
		new_Box(b);
		b.print();
	}

	
	public static void change_i(int i){
		System.out.println("вызов change_i");
		i=7;
	}
	
	public static void change_Box(Box b){
		System.out.println("вызов change_Box");
		b.x=7;
	}
	
	public static void new_Box(Box b){
		b=new Box(100);
	}
	
}
