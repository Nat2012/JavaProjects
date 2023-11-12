package datatype;

import java.time.LocalDate;

public class DateComparer {
    public static int dateComparer(LocalDate date1, LocalDate date2) {
        int date1day = date1.getDayOfMonth();
        int date2day = date2.getDayOfMonth();
        int date1month = date1.getMonthValue();
        int date2month = date2.getMonthValue();
        int date1year = date1.getYear();
        int date2year = date2.getYear();
        int day = date1day - date2day;
        int month = date1month - date2month;
        int year = date1year - date2year;
        System.out.println("Days:" + day);
        System.out.println("Month:" + month);
        System.out.println("Year:");
        return year;
    }
}
