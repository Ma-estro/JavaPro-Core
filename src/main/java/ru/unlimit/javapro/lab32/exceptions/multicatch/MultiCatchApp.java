package ru.unlimit.javapro.lab32.exceptions.multicatch;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class MultiCatchApp {

	public static void main(String[] args) {
		
			try {
				int a = 5/0;

				FileInputStream fis = new FileInputStream("ddddds");
				
				int arr[] = new int[2];
				arr[3]=5;
								
				Object ref = null;
				ref.toString();
			} catch(ArithmeticException|FileNotFoundException|ArrayIndexOutOfBoundsException|NullPointerException e){
				e.printStackTrace();
			}
			
//			} catch (ArithmeticException e) {
//				e.printStackTrace();
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
//			} catch (NullPointerException e) {
//				e.printStackTrace();
//			}
	}

}
