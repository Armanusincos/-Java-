class PersonBase {
    String name;
    int age;
}

class StudentBase extends PersonBase {
    String group;
}

public class z4 {
    public static void main(String[] args) {
        StudentBase s = new StudentBase();
        s.name = "Арман";
        s.age = 20;
        s.group = "ИС-25-21";

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.group);
    }
}
