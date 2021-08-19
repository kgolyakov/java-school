package homework.lab3;

import homework.lab3.builders.*;
import homework.lab3.heroes.*;

import java.util.ArrayList;
import java.util.Random;


public class HeroFactory {
    private ArrayList<HeroBuilder> heroBuilders;
    private Random random = new Random();

    private void addHero(HeroBuilder heroBuilder){
        heroBuilders.add(heroBuilder);
    }

    public HeroFactory(){
        heroBuilders = new ArrayList<>();
        addHero(new HobbitBuilder());
        addHero(new ElfBuilder());
        addHero(new KingBuilder());
        addHero(new KnightBuilder());
    }


    public Hero createHero() {
        int index = random.nextInt(heroBuilders.size());
        return heroBuilders.get(index).createHero();
    }
}
