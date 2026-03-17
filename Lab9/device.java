// Базовый класс
class Device {
    String brand;
    int power;

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " устройство включается");
    }
}

// Класс Laptop
class Laptop extends Device {

    Laptop(String brand, int power) {
        super(brand, power);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " ноутбук включается. Мощность: " + power);
    }
}

// Класс Smartphone
class Smartphone extends Device {

    Smartphone(String brand, int power) {
        super(brand, power);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " смартфон включается. Мощность: " + power);
    }
}

// Класс Tablet
class Tablet extends Device {

    Tablet(String brand, int power) {
        super(brand, power);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " планшет включается. Мощность: " + power);
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Lenovo", 65);
        Smartphone phone = new Smartphone("Samsung", 25);
        Tablet tablet = new Tablet("Apple", 30);

        laptop.turnOn();
        phone.turnOn();
        tablet.turnOn();
    }
}