package Lesson2;

public class ComputerGame {
    // Вы пишете игру. У персонажа есть базовые характеристики, и он может надевать несколько предметов одновременно.
    //Правила:
    //Если есть меч (hasSword), атака увеличивается на 15.
    //Если есть щит (hasShield), защита увеличивается на 20.

    public static void main(String[] args) {
        boolean hasSword = true;
        boolean hasShield = true;
        int attack = 10;
        int defense = 10;

        if(hasSword){
            attack+=15;
        }
        if(hasShield){
            defense+=20;
        }
    }
}
