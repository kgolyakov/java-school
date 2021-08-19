package homework.lab3.heroes;

import java.util.Random;

public class Elf extends Hero{
    private static final String[] POSSIBLE_NAMES = {"Legolas", "Thranduil", "Galadriel", "Tauriel", "Elrond", "Arwen"};
    public Elf() {
        name = POSSIBLE_NAMES[new Random().nextInt(POSSIBLE_NAMES.length)];
        power = 10;
        hp = 10;
    }

    @Override
    protected String logAttack(Hero target) {
        if (target.power + 1 >= power) {
            return target.getClass().getSimpleName() +
                    " " + target.name + " was too strong to be killed, has their power decreased to " + target.power;
        } else {
            return target.getClass().getSimpleName() + " " + target.name + " was killed by " + name;
        }
    }

    @Override
    protected void resolveAttack(Hero target) {
        if (target.power >= power) {
            target.power--;
        } else {
            target.hp = 0;
        }
    }
}
