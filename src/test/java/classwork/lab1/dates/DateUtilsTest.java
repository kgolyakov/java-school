package classwork.lab1.dates;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {
    @Test
    public void generateValidDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        assertEquals(String.format("%04d_%02d_%02d_%02d_%02d_%02d",
                localDateTime.getYear(),
                localDateTime.getMonthValue(),
                localDateTime.getDayOfMonth(),
                localDateTime.getHour(),
                localDateTime.getMinute(),
                localDateTime.getSecond())
                , DateUtils.dateToString(localDateTime));
    }

    @Test
    public void generateLocalDateTime() {
        assertEquals("2021-12-31T23:59:59", DateUtils.stringToDate("2021_12_31_23_59_59").toString());
    }

    @Test
    public void generateLeapYearDate() {
        assertEquals("2020-02-29T23:59:59", DateUtils.stringToDate("2020_02_29_23_59_59").toString());
    }

    @Test
    public void generateLeapYearDateAgain() {
        assertEquals("2000-02-29T23:59:59", DateUtils.stringToDate("2000_02_29_23_59_59").toString());
    }
}