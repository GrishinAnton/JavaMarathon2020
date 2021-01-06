package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.PhysAttack;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int health;
    private final int physDef;
    private final int magicDef;
    private final int physAtt;
    private final int healHimself = 25;
    private final int healTeammate = 10;

    public Paladin() {
        this.health = MAX_HERO_HEALTH;
        this.magicDef = 20;
        this.physAtt = 15;
        this.physDef = 50;
    }

    public void physicalAttack(Hero hero) {
        setDamage(hero, this.physAtt, "physAtt");
    }

    public void healHimself() {
        this.health = Math.min(MAX_HERO_HEALTH, this.health + this.healHimself);
    }

    public void healTeammate(Hero hero) {
        hero.healingHero(hero, healTeammate);
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
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

}
