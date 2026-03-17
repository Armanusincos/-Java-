// Базовый класс
class Animal {

    void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Класс Lion
class Lion extends Animal {

    @Override
    void makeSound() {
        System.out.println("Лев рычит");
    }
}

// Класс Elephant
class Elephant extends Animal {

    @Override
    void makeSound() {
        System.out.println("Слон трубит");
    }
}

// Класс Monkey
class Monkey extends Animal {

    @Override
    void makeSound() {
        System.out.println("Обезьяна кричит");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
    }
}