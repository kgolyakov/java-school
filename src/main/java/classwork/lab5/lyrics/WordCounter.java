package classwork.lab5.lyrics;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class WordCounter {
    @SneakyThrows
    public static long wordCounter(String filepath) {
        return Files.lines(Path.of(filepath))
                .flatMap(textLine -> Arrays.stream(textLine.split("\\W+")))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(wordCounter("data/song.txt"));
    }
}
