package datatype;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;


public class FindLeapDate {
    public static String findLeapDate(Year leapyear) {
        if (leapyear.isLeap()) {
            DayOfWeek day = leapyear.atDay(60).getDayOfWeek();
            int date = leapyear.atDay(60).getDayOfMonth();
            Month month = leapyear.atMonth(2).getMonth();
            System.out.println(day + ", " + date + " " + month + "," + leapyear);
        } else {
            return "Please enter a leap year";
        }
        return "";
    }
}
