package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain02 {
    public static void main(String[] args) {
        System.out.println("============start============");
        Random r = new Random();
        try {


            int random = r.nextInt(5);
            System.out.println("random :" + random);

            System.out.println(10 / random);

        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
            System.out.println("============end============");

    }
}
