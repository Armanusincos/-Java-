// Базовый класс
class TeamMember {
    String name;

    TeamMember(String name) {
        this.name = name;
    }
}

// Класс Player
class Player extends TeamMember {

    Player(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + " играет в команде");
    }
}

// Класс Coach
class Coach extends TeamMember {

    Coach(String name) {
        super(name);
    }

    void train() {
        System.out.println(name + " тренирует команду");
    }
}

// Класс Doctor
class Doctor extends TeamMember {

    Doctor(String name) {
        super(name);
    }

    void heal() {
        System.out.println(name + " лечит игроков");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        Player player = new Player("Алекс");
        Coach coach = new Coach("Игорь");
        Doctor doctor = new Doctor("Сергей");

        player.play();
        coach.train();
        doctor.heal();
    }
}