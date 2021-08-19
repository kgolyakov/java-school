package homework.lab3.builders;

import homework.lab3.heroes.Hero;
import homework.lab3.heroes.King;

public class KingBuilder implements HeroBuilder{
    @Override
    public Hero createHero() {
        return new King();
    }
}
