package kr.ac.kopo.day15;
import java.util.Calendar;

public class Dalluck{

    public static void generateCalendar(int year, int month) {
        Calendar c= Calendar.getInstance();

        //int year=2025;
        //int month=3;

        String dayarr[]=new String [42];
        for (int i = 0; i < dayarr.length; i++) {
            dayarr[i]="\t";
        }
        c.set(year,month-1,1);
        int lastDay=c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int day=c.get(Calendar.DAY_OF_WEEK);
        System.out.println("\n\t<<"+year+"년도"+month+"월"+">>");
        for (int i = 0; i < lastDay; i++) {
            dayarr[i+day]= String.valueOf(i+1);
        }
        for (int i = 0; i <dayarr.length ; i++) {
            System.out.print(dayarr[i]);
            if(i%7==0){
                System.out.println();
            } else if (i>day-1) {
                System.out.print("\t");
            }
        }
    }
}
