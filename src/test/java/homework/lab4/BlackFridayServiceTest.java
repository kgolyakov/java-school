package homework.lab4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BlackFridayServiceTest {

    @Test
    void correctNumberOfBlackFridays() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BlackFridayService.printBlackFridayPerYearSorted(1990, 1990);
        assertLinesMatch(Arrays.stream(new String[]{"1990 - 2"}) , out.toString().lines());
        System.setOut(save_out);
    }

    @Test
    void correctOrderOfBlackFridays() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BlackFridayService.printBlackFridayPerYearSorted(1996, 1998);
        assertLinesMatch(Arrays.stream(new String[]{"1998 - 3",
                "1996 - 2",
                "1997 - 1"}) , out.toString().lines());
        System.setOut(save_out);
    }

    @Test
    void correctOrderOfMultipleBlackFridays() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BlackFridayService.printBlackFridayPerYearSorted(2000, 2010);
        Map<Character, List<String>> collect = out.toString().lines()
                .collect(Collectors.groupingBy(outputString -> outputString.charAt(outputString.length() - 1)));
        assertLinesMatch(List.of("2000 - 1", "2003 - 1", "2005 - 1", "2008 - 1", "2010 - 1"), collect.get('1').stream().sorted().collect(Collectors.toList()));
        assertLinesMatch(List.of("2001 - 2", "2002 - 2", "2004 - 2", "2006 - 2", "2007 - 2"), collect.get('2').stream().sorted().collect(Collectors.toList()));
        assertLinesMatch(List.of("2009 - 3"), collect.get('3').stream().sorted().collect(Collectors.toList()));
        System.setOut(save_out);
    }
}