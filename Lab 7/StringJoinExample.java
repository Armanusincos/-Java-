public class StringJoinExample {

    public static void main(String[] args) {

        String s1 = "Hello ";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "test";
        String s5 = "teset";

        String result;

        if (s4.equals(s5)) {
            result = s1 + s2;
        } else {
            result = s1 + s3;
        }

        System.out.println("Результат: " + result);
    }
}