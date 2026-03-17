// Базовый класс
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

// Класс Student
class Student extends Person {

    Student(String name) {
        super(name);
    }

    void study() {
        System.out.println(name + " учится");
    }
}

// Класс Teacher
class Teacher extends Person {

    Teacher(String name) {
        super(name);
    }

    void teach() {
        System.out.println(name + " преподает");
    }
}

// Класс Administrator
class Administrator extends Person {

    Administrator(String name) {
        super(name);
    }

    void manage() {
        System.out.println(name + " управляет учебным процессом");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Алия");
        Teacher teacher = new Teacher("Иван");
        Administrator admin = new Administrator("Аскар");

        student.study();
        teacher.teach();
        admin.manage();
    }
}