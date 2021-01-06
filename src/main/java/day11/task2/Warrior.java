package day11.task2;

import day11.task2.interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {
    private int health;
    private final int physDef;
    private final int magicDef;
    private final int physAtt;

    public Warrior() {
        this.health = MAX_HERO_HEALTH;
        this.magicDef = 80;
        this.physAtt = 30;
        this.physDef = 80;
    }

    public void physicalAttack(Hero hero) {
        setDamage(hero, this.physAtt, "physAtt");
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
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
