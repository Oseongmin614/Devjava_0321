package kr.ac.kopo.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMain02 {
    public static void main(String[] args) {
        BufferedInputStream bis=null;
        BufferedOutputStream bos = null;
    try {

        for (int i = 0; i < 100; i++) {
            FileInputStream fis= new FileInputStream ("iotest\\koala.jpg");
            FileOutputStream fos = new FileOutputStream(("iotest\\koala"+i+".jpg"));

            bis = new BufferedInputStream(fis);//버퍼를 쓰면 훨씬 빠르다
            bos = new BufferedOutputStream(fos);

            while (true){
                int c= bis.read();
                if(c==-1) break;
                bos.write(c);
            }
        }

        System.out.println("fffffffffffff");
    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
