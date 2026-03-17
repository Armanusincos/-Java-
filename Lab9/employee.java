// Базовый класс
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " выполняет работу");
    }
}

// Класс Manager
class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " управляет проектом");
    }
}

// Класс Developer
class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " пишет код");
    }
}

// Класс Designer
class Designer extends Employee {

    Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " разрабатывает дизайн");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Алексей", 5000);
        Developer developer = new Developer("Иван", 4000);
        Designer designer = new Designer("Мария", 3500);

        manager.work();
        developer.work();
        designer.work();
    }
}