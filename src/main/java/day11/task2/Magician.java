package day11.task2;

import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    private final int magicAtt;

    public Magician() {
        this.health = MAX_HERO_HEALTH;
        this.magicDef = 80;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.physDef = 0;
    }

    public void magicalAttack(Hero hero) {
        setDamage(hero, this.magicAtt, "magicAtt");
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
