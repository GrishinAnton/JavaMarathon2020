package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    private final int magicAtt;
    private final int healHimself = 50;
    private final int healTeammate = 30;

    public Shaman() {
        this.health = MAX_HERO_HEALTH;
        this.magicDef = 20;
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 20;
    }

    public void magicalAttack(Hero hero) {
        setDamage(hero, this.magicAtt, "magicAtt");
    }

    public void healHimself() {
        this.health = Math.min(MAX_HERO_HEALTH, this.health + this.healHimself);
    }

    public void healTeammate(Hero hero) {
        hero.healingHero(hero, healTeammate);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
