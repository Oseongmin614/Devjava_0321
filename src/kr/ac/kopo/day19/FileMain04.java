package kr.ac.kopo.day19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileMain04 {

	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/test.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeChar('A');
			dos.writeInt(97);
			dos.flush();
			
			System.out.println("test.txt에 저장완료...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
		
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			
			fis = new FileInputStream("iotest/test.txt");
			dis = new DataInputStream(fis);
			
			char c = dis.readChar();
			int  i = dis.readInt();
			
			System.out.println("읽어드린 문자 : " + c);
			System.out.println("읽어드린 정수 : " + i);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}
	
	public static void main(String[] args) {
	
		read();
//		write();
		
	}
}











