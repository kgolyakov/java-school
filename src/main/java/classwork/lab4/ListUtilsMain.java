package classwork.lab4;

import java.util.List;

public class ListUtilsMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListUtils.forEachWithDelay(list, 1000, System.out::println);
    }
}
