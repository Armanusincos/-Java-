// Базовый класс
class Vehicle {

    void startEngine() {
        System.out.println("Транспорт запускается");
    }
}

// Класс Bike
class Bike extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Мотоцикл заводит двигатель");
    }
}

// Класс Bus
class Bus extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Автобус запускает двигатель");
    }
}

// Класс Taxi
class Taxi extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Такси запускает двигатель");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        bike.startEngine();
        bus.startEngine();
        taxi.startEngine();
    }
}