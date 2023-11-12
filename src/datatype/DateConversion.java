package datatype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateConversion {
    public static LocalDate dateToLocalDate(Date dateToBeConverted) {
        LocalDate convertedDate = dateToBeConverted.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return convertedDate;
    }

    public static LocalDateTime dateToLocalDateTime(Date dateToBeConverted) {
        LocalDateTime convertedDate = dateToBeConverted.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return convertedDate;
    }

    public static Date localDateToDate(LocalDate dateToBeConverted) {
        Date convertedDate = java.sql.Date.valueOf(dateToBeConverted);
        return convertedDate;
    }

    public static Date localDateTimeToDate(LocalDateTime dateToBeConverted) {
        Date convertedDate = java.sql.Timestamp.valueOf(dateToBeConverted);
        return convertedDate;
    }

}