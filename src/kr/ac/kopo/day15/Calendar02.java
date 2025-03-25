package kr.ac.kopo.day15;

import java.util.Scanner;
import java.util.Calendar;

public class Calendar02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dalluck dalluck = new Dalluck();
        boolean start=true;
        Calendar c = Calendar.getInstance();
        int year = c.get(1);
        int month = c.get(2) + 1;
        while (start){
            System.out.print("\n\n항목을 선택하세요(1. 현재   2. 이전달    3. 다음달   4. 종료)  => ");
        int choose = sc.nextInt();


        switch (choose){
            case 1:
                year = c.get(1);
                month = c.get(2) + 1;
                dalluck.generateCalendar(year, month);
                break;
            case 2:
                --month;
                if (month==0){
                    month=12;
                    --year;
                }
                dalluck.generateCalendar(year, month);
                break;
            case 3:
                ++month;
                if(month==13){
                    month=1;
                    ++year;
                }
                dalluck.generateCalendar(year, month);
                break;
            case 4:
                start= !start;
                break;
        }}




    }
}
