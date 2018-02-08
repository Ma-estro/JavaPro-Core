package ru.unlimit.javapro.lab00;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;


public class JavaTypesClass {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//Удобство записи через подчеркивание _	
		
//		double d = 333_333_333_333.444_444_444_444e40;
		
		//Форма написания в 2, 8 и 16 -й системах исчисления
//		int i = 0b1110;
//		System.out.println(i);
		
//		int j = 010;
//		System.out.println(j);

//		int k = 0xF0;
//		System.out.println(k);
		
		//Представление числа в различных системах исчисления (to)
		
//		int i = 239;
//		System.out.println("Binary: "+Integer.toBinaryString(i));
//		System.out.println("Hexadecimal: "+Integer.toHexString(i));
//		System.out.println("Octal: "+Integer.toOctalString(i));
//		System.out.println("5: "+Integer.toUnsignedString(i, 5));
		
		
		//Получение числа из других систем исчисления (valueOf)
//		String octal="10";
//		System.out.println(Integer.valueOf(octal, 8));
//		
//		String hex="FF";
//		System.out.println(Integer.valueOf(hex, 16));
//		
//		String bi="1111101";
//		System.out.println(Integer.valueOf(bi, 2));
//		
//		String d = "123ghj";
//		System.out.println(Integer.valueOf(d, 20));
		
		//Представление символьного типа с помощью кода Unicode uXXXX
		
//		char ch='\u0044';
//		System.out.println(ch);
//		
//		char ch2='\u0416';
//		System.out.println(ch2);
		
		
//		char ch;
//		
//		ch=0x0001;
//		System.out.println(Arrays.toString((""+ch).getBytes("UTF-8")));
//
//		ch=0x0111;
//		System.out.println(Arrays.toString((""+ch).getBytes("UTF-8")));
//		
//		ch=0x1111;
//		System.out.println(Arrays.toString((""+ch).getBytes("UTF-8")));	
		
		
		
		char ch1=55378;
		char ch2=56816;
		String s=new String(new char[]{ch1,ch2});	
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.codePointCount(0, 2));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		
		
		
	}

}
