package datatype;
import java.time.LocalDate;
public class DateTeller {
    public static String dateTeller(LocalDate date){
        LocalDate currentDate = LocalDate.now();
        if (date.equals(currentDate)){
            return "Present";
        }
        if (date.isAfter(currentDate)){
            return "Future";
        }
        return "Past";
    }
}
