package homework.lab4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {
        Stream.iterate(LocalDate.of(startYear, 1, 13),
                currentDate -> currentDate.getYear() <= endYear,
                currentDate -> currentDate.plusMonths(1))
                .filter(currentDate -> currentDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((yearEntry1, yearEntry2) -> (int) (yearEntry2.getValue() - yearEntry1.getValue()))
                .forEach(yearEntry -> System.out.println(yearEntry.getKey() + " - " + yearEntry.getValue()));
    }

    public static void main(String[] args) {
        printBlackFridayPerYearSorted(2000, 2010);
    }
}