package ru.unlimit.javapro.lab35.ex_in_blocks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsInBlocksApp {
	public static void main(String[] args) throws IOException {
		//Исключение в блоке try
		//Исключение в блоке catch
		//Исключение в блоке finally
		
		try{
			System.err.println("1. Начало блока Try");
			int arr[] = new int[2];
			arr[5] = 1000;
			System.err.println("2. Окончание блока Try");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("3. Начало блока Catch");
			if(true)
				throw new IllegalArgumentException("Неверный аргумент",e);
			System.err.println("4. Окончание блока Catch");
		}
		finally{
			System.err.println("5. Начало блока Finally");
			if(true)
				throw new IOException("Ошибка ввода-вывода");			
			System.err.println("6. Окончание блока Finally");
		}
		System.err.println("7. Код после блока Try-Catch-Finally");
	}
}
