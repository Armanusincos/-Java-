class PersonPoly {
    void displayInfo() {
        System.out.println("Человек");
    }
}

class StudentPoly extends PersonPoly {
    @Override
    void displayInfo() {
        System.out.println("Студент");
    }
}

public class z5 {
    public static void main(String[] args) {
        PersonPoly p = new StudentPoly();
        p.displayInfo();
    }
}
