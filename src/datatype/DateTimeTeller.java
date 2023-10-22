package datatype;
import java.time.LocalDateTime;
public class DateTimeTeller {
    public static String dateTimeTeller(LocalDateTime dateTime){
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        System.out.println(currentLocalDateTime);
        System.out.println(dateTime);
        if (dateTime.isEqual(currentLocalDateTime)){
            return "Present";
        }
        if (dateTime.isAfter(currentLocalDateTime)){
            return "Future";
        }
        return "Past";
    }
}
