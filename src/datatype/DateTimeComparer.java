package datatype;

import java.time.LocalDateTime;

public class DateTimeComparer {
    public static int dateTimeComparer(LocalDateTime date1, LocalDateTime date2) {
        int date1min = date1.getMinute();
        int date2min = date2.getMinute();
        int date1hour = date1.getHour();
        int date2hour = date2.getHour();
        int date1day = date1.getDayOfMonth();
        int date2day = date2.getDayOfMonth();
        int date1month = date1.getMonthValue();
        int date2month = date2.getMonthValue();
        int date1year = date1.getYear();
        int date2year = date2.getYear();
        int min = date1min - date2min;
        int hour = date1hour - date2hour;
        int day = date1day - date2day;
        int month = date1month - date2month;
        int year = date1year - date2year;
        System.out.println("Minutes:" + min);
        System.out.println("Hours:" + hour);
        System.out.println("Days:" + day);
        System.out.println("Month:" + month);
        System.out.println("Year:");
        return year;
    }
}
