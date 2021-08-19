package homework.lab3.heroes;

import java.util.Random;

public class King extends Hero{
    private static final String[] POSSIBLE_NAMES = {"Aragorn", "Sauron"};
    public King() {
        name = POSSIBLE_NAMES[new Random().nextInt(POSSIBLE_NAMES.length)];
        Random random = new Random();
        power = random.nextInt(11) + 5;
        hp = random.nextInt(11) + 5;
    }
}
