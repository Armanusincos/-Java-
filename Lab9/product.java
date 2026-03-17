// Базовый класс
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showPrice() {
        System.out.println("Цена товара: " + price);
    }
}

// Класс Food
class Food extends Product {

    Food(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Продукт питания " + name + " стоит " + price);
    }
}

// Класс Electronics
class Electronics extends Product {

    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Электроника " + name + " стоит " + price);
    }
}

// Класс Clothes
class Clothes extends Product {

    Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Одежда " + name + " стоит " + price);
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Food food = new Food("Хлеб", 120);
        Electronics electronics = new Electronics("Телефон", 250000);
        Clothes clothes = new Clothes("Футболка", 8000);

        food.showPrice();
        electronics.showPrice();
        clothes.showPrice();
    }
}