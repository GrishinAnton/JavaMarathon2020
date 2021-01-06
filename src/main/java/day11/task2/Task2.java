package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(paladin);
        shaman.physicalAttack(warrior);
        paladin.healHimself();

        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);

        System.out.println(warrior.toString());
        System.out.println(paladin.toString());
        System.out.println(magician.toString());
        System.out.println(shaman.toString());

//        Paladin{health=85}
//        Magician{health=85}
//        Magician{health=100}
//        Paladin{health=69}
//        Warrior{health=98}
//        Paladin{health=94}
//
//        Magician{health=70}
//        Magician{health=40}
//        Magician{health=10}
//        Magician{health=0}
//        Magician{health=0}


    }
}
