package ru.unlimit.javapro.lab33.exceptions.try_with_res;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TryResApp {

	public static void main(String[] args) throws IOException{
		//До Java 6 включительно
//		String s = "Привет, Java!";
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("C:/ALL/tmp/HelloJava.txt");//!!!
//			fos.write(s.getBytes());//!!!
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally{
//			fos.close();//!!!
//		}

		//Java7
//		String s = "Привет, Java!";
//		try(FileOutputStream fos = new FileOutputStream("C:/ALL/tmp/HelloJava.txt")){
//			fos.write(s.getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try(	FileInputStream fis = new FileInputStream("C:/ALL/tmp/Пушкин.txt");
				FileOutputStream fos = new FileOutputStream("C:/ALL/tmp/Пушкин_копия.txt");
				ByteArrayOutputStream baos = new ByteArrayOutputStream()){
			
					int b;
					while((b=fis.read())!=-1){
						baos.write(b);
					}
					baos.writeTo(fos);
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
