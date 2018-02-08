package ru.unlimit.javapro.lab22_inheritance;

public class Point3D extends Point{

	int z;

	String s="3d";
	
	public Point3D(){
		super();
		z=0;
	}
	
	public Point3D(int x1, int y1,int z1) {
		super(x1,y1);
		z = z1;
	}


	@Override
	public String toString() {
		return super.toString()+", z=" + z;
	}

	@Override
	void print() {
		System.out.println("{x="+x+", y="+y+", z="+z+ "}");
	}
	
	public void print_s(){
		System.out.println(super.s);
	}
	
}
