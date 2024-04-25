package atm;

import java.util.Scanner;

public class Display {
    static Scanner scanner = new Scanner(System.in);
    
    void prompt(String message) {
        System.out.println(message);
    }

    String input(String message) {
        System.out.print(message);
        String value = scanner.nextLine();
        return value;
    }

    void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
