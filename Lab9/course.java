// Базовый класс
class Course {

    void startCourse() {
        System.out.println("Курс начинается");
    }
}

// Курс программирования
class ProgrammingCourse extends Course {

    @Override
    void startCourse() {
        System.out.println("Начался курс программирования");
    }
}

// Курс математики
class MathCourse extends Course {

    @Override
    void startCourse() {
        System.out.println("Начался курс математики");
    }
}

// Курс истории
class HistoryCourse extends Course {

    @Override
    void startCourse() {
        System.out.println("Начался курс истории");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        ProgrammingCourse prog = new ProgrammingCourse();
        MathCourse math = new MathCourse();
        HistoryCourse history = new HistoryCourse();

        prog.startCourse();
        math.startCourse();
        history.startCourse();
    }
}