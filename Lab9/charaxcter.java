// Базовый класс
class Character {

    void attack() {
        System.out.println("Персонаж атакует");
    }
}

// Класс Warrior
class Warrior extends Character {

    @Override
    void attack() {
        System.out.println("Воин атакует мечом");
    }
}

// Класс Mage
class Mage extends Character {

    @Override
    void attack() {
        System.out.println("Маг атакует магией");
    }
}

// Класс Archer
class Archer extends Character {

    @Override
    void attack() {
        System.out.println("Лучник стреляет из лука");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Archer archer = new Archer();

        warrior.attack();
        mage.attack();
        archer.attack();
    }
}