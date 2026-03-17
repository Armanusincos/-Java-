// Базовый класс
class Appliance {

    void operate() {
        System.out.println("Прибор работает");
    }
}

// Класс Refrigerator
class Refrigerator extends Appliance {

    @Override
    void operate() {
        System.out.println("Холодильник охлаждает продукты");
    }
}

// Класс WashingMachine
class WashingMachine extends Appliance {

    @Override
    void operate() {
        System.out.println("Стиральная машина стирает одежду");
    }
}

// Класс Microwave
class Microwave extends Appliance {

    @Override
    void operate() {
        System.out.println("Микроволновка разогревает еду");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator();
        WashingMachine washingMachine = new WashingMachine();
        Microwave microwave = new Microwave();

        refrigerator.operate();
        washingMachine.operate();
        microwave.operate();
    }
}