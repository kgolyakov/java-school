package homework.lab3.heroes;

import java.util.Random;

public class Hobbit extends Hero {
    private static final String[] POSSIBLE_NAMES = {"Bilbo", "Frodo", "Sam", "Merry", "Pippin"};
    public Hobbit() {
        name = POSSIBLE_NAMES[new Random().nextInt(POSSIBLE_NAMES.length)];
        power = 0;
        hp = 3;
    }

    @Override
    protected String logAttack(Hero target) {
        return target.getClass().getName().substring(target.getClass().getName().lastIndexOf('.') + 1)
                + " " + target.name + " is fine, " + name + " cried instead.";
    }
}
