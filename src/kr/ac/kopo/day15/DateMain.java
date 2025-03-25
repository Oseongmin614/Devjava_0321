package kr.ac.kopo.day15;

import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d);
        System.out.print(d.getYear()+1900+"년");
        System.out.print(d.getMonth()+1+"월");
        System.out.print(d.getDate()+"일");
        int day = d.getDay();
        char[] week={'일','월','화','수','목','금','토'};
        System.out.println(week[day]+"요일");
        System.out.println("=======calendar=======");
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        System.out.print(c.get(Calendar.YEAR)+"년");
        System.out.print(c.get(Calendar.MONTH)+1+"월");
        System.out.print(c.get(Calendar.DATE)+"일");
        System.out.print(week[c.get(Calendar.DAY_OF_WEEK)-1]+"요일");
        System.out.println("=======calendar set연습=======");
        c.set(2029,2-1,17);
    }
}
