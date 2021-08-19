package homework.lab3.builders;

import homework.lab3.heroes.Elf;
import homework.lab3.heroes.Hero;

public class ElfBuilder implements HeroBuilder{
    @Override
    public Hero createHero() {
        return new Elf();
    }
}
