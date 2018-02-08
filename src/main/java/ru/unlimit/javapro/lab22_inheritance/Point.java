package ru.unlimit.javapro.lab22_inheritance;

public class Point {

	int x;
	int y;
	
	String s="2d";
	
	public Point(){
		x=0;
		y=0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point x=" + x + ", y=" + y;
	}
	void print(){
		System.out.println("{x="+x+", y="+y+"}");
	}
	void func(){
		System.out.println(x);
	}
}
