package ru.unlimit.javapro.subscribers;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Replace {
	public static void main(String[] args) throws IOException {
		//замена подстроки в середину файла
		String file1 = "C:/ALL/tmp/1.txt";
		String file2 = "C:/ALL/tmp/2.txt";
		String old_str = "Word";
		String new_str = "Space";
		
		//заменяет все вхождения old_str на new_str
		//replace_string(old_str,new_str, new FileInputStream(file1),new FileOutputStream(file2),true);
		//заменяет первое вхождение old_str на new_str
		replace_string(old_str,new_str, new FileInputStream(file1),new FileOutputStream(file2),false);
		
	}
	private static void replace_string(String old_str,String new_str,
									   FileInputStream fis, FileOutputStream fos,boolean all) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		while(true){
			int b = fis.read();
			if(b!=-1)
				baos.write(b);
			else
				break;
		}
		
		fis.close();
		
		String s = new String(baos.toByteArray(),StandardCharsets.UTF_8);
		if(all){
			s = s.replaceAll(old_str, new_str);
		}else{
			s = s.replaceFirst(old_str, new_str);
		}
		
		fos.write(s.getBytes(StandardCharsets.UTF_8));
		fos.close();	
	}
}
