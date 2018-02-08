package ru.unlimit.javapro.lab30.exceptions;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;


public class TryCatchFinally {

	public static void main(String[] args) {
		
//		t-c-f
		try{
			
		}
		catch(Exception e){
			
		}
		finally{
			
		}
//		t-c
		try{
			
		}
		catch(Exception e){
			
		}
//		t-f
		try{
			
		}
		finally{
			
		}
//		t-c-c-...-c
//		t-c-c-...c-f
		try{
			URL url = new URL("http://www.yandex.ru");
			
			InputStream is = url.openStream();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			int b;
			while((b=is.read())!=-1){
				baos.write(b);
			}
			System.out.println(baos.toString());
			
			int a = 5/2;
			
			FileInputStream fis = new FileInputStream("ddddds");
		}
		catch(MalformedURLException e){
			System.out.println("Ошибка протокола.");
		}
		catch(UnknownHostException e){
			System.out.println("Неизвестный хост");
			
			try {
				FileInputStream fis = new FileInputStream("ddddds");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			finally{
				try {
					FileInputStream fis = new FileInputStream("ddddds");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		catch(ArithmeticException e){
			System.out.println("Деление на ноль запрещено.");
		}
		catch(FileNotFoundException e){
			System.out.println("Ошибка доступа к файлу");
		}
		catch(Exception e){
			System.out.println("Исключение.");
		}
		finally{
			System.out.println("Finally");
		}
//		вложенные t-c-f
	}

}
