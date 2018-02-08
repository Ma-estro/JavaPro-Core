package ru.unlimit.javapro.lab16;

public class Lab16_Debug {

	public static void main(String[] args) {
		
		//Отладка программы в Eclipse
		
		double d=4;
		double result=Pow(d);
		
		System.out.println(d);
		System.out.println(result);
	}

	public static double Pow(double value){
		double new_value=Math.pow(value,2);
		return new_value;
	}
}
