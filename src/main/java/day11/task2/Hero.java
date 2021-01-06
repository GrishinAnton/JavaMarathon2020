package day11.task2;

public abstract class Hero {
    public static final int MAX_HERO_HEALTH = 100;
    public static final int MIN_HERO_HEALTH = 0;


    public abstract void setHealth(int health);
    public abstract int getHealth();
    public abstract int getPhysDef();
    public abstract int getMagicDef();

    public void setDamage(Hero hero, int damage, String type){
        int realDamage = getRealDamage(hero, damage, type);
        hero.setHealth(Math.max(hero.getHealth() - realDamage, MIN_HERO_HEALTH));
    }

    public int getRealDamage(Hero hero, int damage, String type) {
        int realDamage = 0;
        switch (type) {
            case "physAtt":
                realDamage = damage - ((damage * hero.getPhysDef()) / 100);
                break;
            case "magicAtt":
                realDamage = damage - ((damage * hero.getMagicDef()) / 100);
                break;
        }

        return realDamage;
    }

    public void healingHero(Hero hero, int healing){
        int currentHeal = hero.getHealth();
        hero.setHealth(Math.max(currentHeal + healing, MAX_HERO_HEALTH));
    }
}
