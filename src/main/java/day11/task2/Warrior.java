package day11.task2;

import day11.task2.interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        this.health = MAX_HERO_HEALTH;
        this.magicDef = 80;
        this.physAtt = 30;
        this.physDef = 80;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
