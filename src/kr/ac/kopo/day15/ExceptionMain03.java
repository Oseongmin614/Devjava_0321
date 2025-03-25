package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain03 {
    public static void main(String[] args) {
        System.out.println("============start============");
        Random r = new Random();
        try {
            int random = r.nextInt(5);
            System.out.println("random :" + random);

            System.out.println(10 / random);
            char[] arr = new char[3];
            System.out.println("문자 " + arr[3]);
//        }catch (ArithmeticException ae){
//            ae.printStackTrace();
//        }catch (ArrayIndexOutOfBoundsException aioe) {
//            System.out.println("============end============");
//            aioe.printStackTrace();
        /*}catch (ArithmeticException |ArrayIndexOutOfBoundsException e){
            e.printStackTrace();*/
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("============end============");
    }
}
