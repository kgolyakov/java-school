package homework.lab3.heroes;

import java.util.Random;

public class Knight extends Hero{
    private static final String[] POSSIBLE_NAMES = {"Alice", "Bob", "Carol", "David"};
    public Knight() {
        name = POSSIBLE_NAMES[new Random().nextInt(POSSIBLE_NAMES.length)];
        Random random = new Random();
        power = random.nextInt(11) + 2;
        hp = random.nextInt(11) + 2;
    }
}
