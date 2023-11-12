package datatype;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TeamMeetingScheduler {
    public static List<String> teamMeetingScheduler(LocalDate dateParam, int interval) {
        List<String> schedules = new ArrayList<>();
        LocalDate currentdate = LocalDate.now();
        while (currentdate.isBefore(dateParam)) {
            DayOfWeek day = currentdate.getDayOfWeek();
            int date = currentdate.getDayOfMonth();
            Month month = currentdate.getMonth();
            int year = currentdate.getYear();
            currentdate = currentdate.plusDays(interval);
            schedules.add(day + ", " + date + " " + month + "," + year);
        }
        return schedules;
    }
}
