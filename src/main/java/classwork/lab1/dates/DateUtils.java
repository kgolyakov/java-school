package classwork.lab1.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateUtils {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");

    public static LocalDateTime stringToDate(String date) {
        return LocalDateTime.parse(date, formatter);
    }

    public static String dateToString(LocalDateTime localDateTime){
        return localDateTime.format(formatter);
    }
}
