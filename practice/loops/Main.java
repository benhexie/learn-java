package loops;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }


        final String[] fruits = {"Banana", "Orange", "Pawpaw"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}