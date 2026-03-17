// Базовый класс
class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " движется со скоростью " + speed + " км/ч");
    }
}

// Производный класс Car
class Car extends Transport {

    Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " едет по дороге со скоростью " + speed + " км/ч");
    }
}

// Производный класс Train
class Train extends Transport {

    Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " движется по рельсам со скоростью " + speed + " км/ч");
    }
}

// Производный класс Airplane
class Airplane extends Transport {

    Airplane(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " летит по воздуху со скоростью " + speed + " км/ч");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Машина", 120);
        Train train = new Train("Поезд", 200);
        Airplane airplane = new Airplane("Самолет", 800);

        car.move();
        train.move();
        airplane.move();
    }
}