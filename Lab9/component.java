// Базовый класс
class Component {

    void showInfo() {
        System.out.println("Компьютерный компонент");
    }
}

// Класс CPU
class CPU extends Component {

    @Override
    void showInfo() {
        System.out.println("CPU — центральный процессор");
    }
}

// Класс RAM
class RAM extends Component {

    @Override
    void showInfo() {
        System.out.println("RAM — оперативная память");
    }
}

// Класс GPU
class GPU extends Component {

    @Override
    void showInfo() {
        System.out.println("GPU — графический процессор");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU();
        RAM ram = new RAM();
        GPU gpu = new GPU();

        cpu.showInfo();
        ram.showInfo();
        gpu.showInfo();
    }
}