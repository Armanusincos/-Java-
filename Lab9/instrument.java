// Базовый класс
class Instrument {

    void playSound() {
        System.out.println("Инструмент издает звук");
    }
}

// Класс Guitar
class Guitar extends Instrument {

    @Override
    void playSound() {
        System.out.println("Гитара играет: дзынь-дзынь");
    }
}

// Класс Piano
class Piano extends Instrument {

    @Override
    void playSound() {
        System.out.println("Пианино играет: динь-динь");
    }
}

// Класс Drums
class Drums extends Instrument {

    @Override
    void playSound() {
        System.out.println("Барабаны играют: бум-бум");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drums drums = new Drums();

        guitar.playSound();
        piano.playSound();
        drums.playSound();
    }
}