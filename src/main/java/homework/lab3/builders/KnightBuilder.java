package homework.lab3.builders;

import homework.lab3.heroes.Hero;
import homework.lab3.heroes.Knight;

public class KnightBuilder implements HeroBuilder{
    @Override
    public Hero createHero() {
        return new Knight();
    }
}
