package day11.task2;

import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int health;
    private final int physDef;
    private final int magicDef;
    private final int physAtt;
    private final int magicAtt;

    public Magician() {
        this.health = MAX_HERO_HEALTH;
        this.magicDef = 80;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.physDef = 0;
    }

    public void physicalAttack(Hero hero) {
        setDamage(hero, this.physAtt, "physAtt");
    }

    public void magicalAttack(Hero hero) {
        setDamage(hero, this.magicAtt, "magicAtt");
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getPhysDef() {
        return physDef;
    }

    @Override
    public int getMagicDef() {
        return magicDef;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
