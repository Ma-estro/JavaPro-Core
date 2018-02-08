package ru.unlimit.javapro.lab00;

class Base{
	int baseValue1;
	
	int baseValue2=2;
	
	int baseFunc=baseFunc();
	static{
		staticBase=4;
		System.out.println("staticBaseBlock");
	}
	static int staticBase;
	static int staticBaseFunc=staticBaseFunc();
	
	Base(){
		System.out.println("Base constructor");
		System.out.println("baseValue1="+baseValue1);
		System.out.println("baseValue2="+baseValue2);
		System.out.println("baseFunc="+baseFunc);
		System.out.println("staticBase="+staticBase);
		System.out.println("staticBaseFunc="+staticBaseFunc);
		System.out.println("After Base main()");
	}


	private int baseFunc() {
		System.out.println("Calling baseFunc");
		return 5;
	}
	private static int staticBaseFunc() {
		System.out.println("Calling staticBaseFunc");
		return 6;
	}

	{
		baseValue2=3;
		System.out.println("BaseBlock");
	}

	
}

public class Derrived extends Base {

	int derrivedValue1;
	{
		derrivedValue2=12;
		System.out.println("DerrivedBlock");
	}
	static int staticDerrivedFunc=staticDerrivedFunc();
	static int staticDerrived;
	int derrivedValue2=11;
	int derrivedFunc=derrivedFunc();
	Derrived(){
		System.out.println("Derrived constructor");
		System.out.println("derrivedValue1="+derrivedValue1);
		System.out.println("derrivedValue2="+derrivedValue2);
		System.out.println("derrivedFunc="+derrivedFunc);
		System.out.println("staticDerrived="+staticDerrived);
		System.out.println("staticDerrivedFunc="+staticDerrivedFunc);
		System.out.println("After Drrived main()");
	}

	private static int staticDerrivedFunc() {
		System.out.println("Calling staticDerrivedFunc");
		return 14;
	}

	private int derrivedFunc() {
		System.out.println("Calling derrivedFunc");
		return 8;
	}

	static{
		staticDerrived=13;
		System.out.println("staticDerrivedBlock");
	}
	
	public static void main(String[] args){
		
		Derrived d=new Derrived();
		System.out.println(d.derrivedValue2);
	}
}
