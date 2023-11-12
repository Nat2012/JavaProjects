package datatype;

import java.time.Year;

public class CheckIfLeapYear {
    public static String checkIfLeapYear(Year year) {
        if (year.isLeap()) {
            return "It is leap year";
        }
        return "It is not a leap year";
    }
}
