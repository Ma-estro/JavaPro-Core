package ru.unlimit.javapro.lab36.exceptions.returns;
public class ReturnExApp {

	public static void main(String[] args){
		//Return в блоке try
		//Return в блоке catch
		//Return в блоке finally
		
		int result = func();
		System.out.println("result: " + result);
		
	}
	private static int func(){
		try{
			//return 1;
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e){
			return 2;
			//throw new RuntimeException();
		}
		finally{
			//return 3;
		}
		
		//return 4;
	}
}
