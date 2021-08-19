package homework.lab3.heroes;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
abstract
public class Hero {
    protected String name;
    protected int power;
    protected int hp;

    public String kick(Hero target) {
        resolveAttack(target);
        return logAttack(target);
    }

    protected void resolveAttack(Hero target) {
        target.hp -= power;
    }

    protected String logAttack(Hero target) {
        return target.getClass().getName().substring(target.getClass().getName().lastIndexOf('.') + 1)
                + " " + target.name + " is attacked for " + power + " hp, " + (Math.max(target.hp, 0)) + " remaining";
    }

    public final boolean isAlive(){
        return hp > 0;
    }
}
