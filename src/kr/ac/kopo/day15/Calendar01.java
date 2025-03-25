package kr.ac.kopo.day15;

import java.util.Scanner;


public class Calendar01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dalluck dalluck = new Dalluck();
        boolean start=true;
        while (start){
        System.out.print("\n항목을 선택하세요(1. 특정년도   2. 특정월    3.종료)  => ");
        int choose = sc.nextInt();

        switch (choose){
            case 1:
                System.out.print("년도를 입력하세요 => ");
                int year = sc.nextInt();
                for (int i = 1; i <=12 ; i++) {
                    dalluck.generateCalendar(year, i);
                }
                break;
            case 2:
                System.out.print("년도를 입력하세요 => ");
                year = sc.nextInt();
                System.out.print("월을 입력하세요 => ");
                int month = sc.nextInt();
                dalluck.generateCalendar(year, month);
                break;
            case 3:
                start= !start;
                break;
        }}




    }
}
