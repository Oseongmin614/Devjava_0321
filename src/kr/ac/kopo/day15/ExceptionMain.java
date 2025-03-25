package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain {
    public static void main(String[] args) {
        System.out.println("============start============");
        Random r = new Random();

       int random = r.nextInt(5);
        System.out.println("random :"+random);

        System.out.println(10/random);//0일때 예외 발생후 종료
        System.out.println("============end============");

    }
}
