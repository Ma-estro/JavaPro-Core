package ru.unlimit.javapro.lab22_inheritance;

import java.util.Date;

public class Point4D extends Point3D{

	Date time = new Date();

	@Override
	void print() {
		super.print();
	}

	@Override
	public String toString() {
		return super.toString()+", time=" + time;
	}
	
	
}
