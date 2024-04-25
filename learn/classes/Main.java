package classes;

import java.util.Scanner;

public class Main {
    static void intro() {
        System.out.println("Welcome to Greeter!\n");
    }

    void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        intro();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();

        Main obj = new Main();
        obj.sayHello(name);
    }
}
