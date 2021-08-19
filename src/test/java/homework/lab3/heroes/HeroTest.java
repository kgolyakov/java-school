package homework.lab3.heroes;

import homework.lab3.GameManager;
import homework.lab3.HeroFactory;
import org.junit.jupiter.api.Test;

class HeroTest {
    @Test
    public void hitHobbitWithHobbit() {
        Hero hero = new Hobbit();
        Hero hero1 = new Hobbit();
        System.out.println(hero.kick(hero1));
        System.out.println(hero1.kick(hero));
    }

    @Test
    public void hitHobbitWithElf() {
        Hero hero = new Elf();
        Hero hero1 = new Hobbit();
        System.out.println(hero.kick(hero1));
        System.out.println(hero1.kick(hero));
    }

    @Test
    public void hitElfWithElf() {
        Hero hero = new Elf();
        Hero hero1 = new Elf();
        System.out.println(hero.kick(hero1));
        System.out.println(hero1.kick(hero));
        System.out.println(hero.kick(hero1));
        System.out.println(hero1.kick(hero));
    }

    @Test
    public void hitElfWithKnight() {
        Hero hero = new Elf();
        Hero hero1 = new Knight();
        System.out.println(hero.kick(hero1));
        System.out.println(hero1.kick(hero));
        System.out.println(hero.kick(hero1));
        System.out.println(hero1.kick(hero));
    }

    @Test
    public void managedBattle() {
        Hero hero = new Knight();
        Hero hero1 = new Knight();
        GameManager.fight(hero, hero1);
        hero = new Elf();
        hero1 = new King();
        GameManager.fight(hero, hero1);
    }

    @Test
    public void generatedBattle() {
        HeroFactory heroFactory = new HeroFactory();
        Hero hero = heroFactory.createHero();
        Hero hero1 = heroFactory.createHero();
        GameManager.fight(hero, hero1);
        hero = heroFactory.createHero();
        hero1 = heroFactory.createHero();
        GameManager.fight(hero, hero1);
        hero = heroFactory.createHero();
        hero1 = heroFactory.createHero();
        GameManager.fight(hero, hero1);
    }
}