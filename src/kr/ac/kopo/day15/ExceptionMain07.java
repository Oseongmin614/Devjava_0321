package kr.ac.kopo.day15;

import java.util.Scanner;

public class ExceptionMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("짝수입력 : ");
        int num = sc.nextInt();
        sc.nextLine();
         try  {
                if (num % 2 != 0) {
                    throw new Exception();
//                    System.out.println("W짝수아님");
                }
            System.out.println(" 입력하신 짝수는 " + num + "입니다.");
                } catch (Exception e) {
             e.printStackTrace();
         }


    }
}
