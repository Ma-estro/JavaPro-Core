package ru.unlimit.javapro.lab31.exceptions.throw_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class App {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		
		//throw
		
		func();
		
		//throws
		
		func2();
		
	}

	private static void func2() throws FileNotFoundException, MalformedURLException {
		
		FileInputStream fis = new FileInputStream("sssss");
		URL url = new URL("www.yandex.ru");
	}

	private static void func() {
		
//		try {
//			throw new Exception("Мое исключение");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		Exception e = new Exception("Мое исключение");
//		throw e;
		
		
//		try {
//			URL url = new URL("www.yandex.ru");
//		} catch (MalformedURLException e) {
//			System.out.println("Ошибка протокола.");
//			//throw e;
//			try {
//				throw new Exception("Ошибка протокола",e);
//			} catch (Exception e1) {
//				
//				try {
//					throw new Exception("Снова исключение",e1);
//				} catch (Exception e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
//			}
//		}
		
	}

}
