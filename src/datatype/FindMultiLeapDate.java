package datatype;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class FindMultiLeapDate {
    public static String findMultiLeapDate(Year year1, Year year2) {
        Year currentYear = year1;
        while (year2.isAfter(currentYear)) {
            if (currentYear.isLeap()) {
                DayOfWeek day = currentYear.atDay(60).getDayOfWeek();
                int date = currentYear.atDay(60).getDayOfMonth();
                Month month = currentYear.atMonth(2).getMonth();
                System.out.println(day + ", " + date + " " + month + "," + currentYear);
            }
            currentYear = currentYear.plusYears(1);
        }
        return "Done!";
    }
}
