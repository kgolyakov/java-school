package classwork.lab4;

import java.util.List;
import java.util.function.Consumer;

public class ListUtils {


    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer){

        for (T obj : list) {
            consumer.accept(obj);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
