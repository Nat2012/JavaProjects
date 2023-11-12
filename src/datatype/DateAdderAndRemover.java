package datatype;

import java.time.LocalDate;

public class DateAdderAndRemover {
    public static String dateAdderAndRemover(String operator, LocalDate date1, LocalDate date2) {
        int date1day = date1.getDayOfMonth();
        int date2day = date2.getDayOfMonth();
        int date1month = date1.getMonthValue();
        int date2month = date2.getMonthValue();
        int date1year = date1.getYear();
        int date2year = date2.getYear();
        int dayplus = date1day + date2day;
        int dayminus = date1day - date2day;
        int monthplus = date1month + date2month;
        int monthminus = date1month - date2month;
        int yearplus = date1year + date2year;
        int yearminus = date1year - date2year;
        if (operator == "+") {
            System.out.println("Day:" + dayplus);
            System.out.println("Month:" + monthplus);
            System.out.println("Year:" + yearplus);
        }
        if (operator == "-") {
            System.out.println("Day:" + dayminus);
            System.out.println("Month:" + monthminus);
            System.out.println("Year:" + yearminus);
        }
        return "";
    }
}
