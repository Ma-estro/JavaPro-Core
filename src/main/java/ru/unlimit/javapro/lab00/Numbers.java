package ru.unlimit.javapro.lab00;
import java.util.ArrayList;
import java.util.List;


public class Numbers {

	
	private static void f(float... a){
		
	}
	public static void main(String[] args) {
		
		f(3L,12L);
		
//		short s = '\u8fff';
//		char d = 0x10000;
//		short y=0x7FFF;
//		System.out.println(y);
		long var = Long.MAX_VALUE;
		float f = var;
		System.out.println(var);
		System.out.println(f);
		final long l = 24 * 60 * 60 * 1000 * 1000l;
		System.out.println(l);
		int k=(int)l;
		System.out.println(k);
		
//		List string = new ArrayList();
//		System.out.println(string instanceof String);//!!!!!!!!!!!!
//		System.out.println(new Integer(123) instanceof Short);
		
//		long x = 5;
//		long y = 2;
//		byte b = (byte) x / y;
		
		long l2=1_000_000_000_0l;
		
		
		int i=0;
		func(i++);
		System.out.println(i);
	}

	public static void func(int k){
		System.out.println(k);
	}
}
