package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {
	public static void main(String[] args) {
		// copy ( C:\\temp\\file1.txt => C:\\temp\\file2.txt )
		
		try(FileInputStream fis = new FileInputStream("C:\\temp\\iu.mp4");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:\\temp\\iucopy.mp4");
		BufferedOutputStream bos = new BufferedOutputStream(fos)){	
			int data = 0;
			
			byte b[] = new byte[8192]; //8kb
			
			long start = System.currentTimeMillis();
			
			while((data=fis.read(b))!=-1) {
				bos.write(b);
			}	
			
			long end = System.currentTimeMillis();
			System.out.println("InputStream+Buffered+byte / OutputStream+Buffered+byte걸린 시간 "+(end-start)+"ms"
					+ "");
			
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		

	}
}
















