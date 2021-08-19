package homework.lab3;

import homework.lab3.heroes.Hero;

public class GameManager {
    private static int turnLimit = 100;

    public static void fight(Hero hero1, Hero hero2) {
        for (int i = 0; hero1.isAlive() && hero2.isAlive() && i < turnLimit; i++) {
            System.out.println(hero1.kick(hero2));
            System.out.println(hero2.kick(hero1));
        }
    }
}
