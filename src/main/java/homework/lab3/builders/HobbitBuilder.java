package homework.lab3.builders;

import homework.lab3.heroes.Hero;
import homework.lab3.heroes.Hobbit;

public class HobbitBuilder implements HeroBuilder{
    @Override
    public Hero createHero() {
        return new Hobbit();
    }
}
