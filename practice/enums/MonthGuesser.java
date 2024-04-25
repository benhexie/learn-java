package enums;

import java.util.Scanner;

enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

public class MonthGuesser {
    public static void main(String[] args) {
        Month month = Month.values()[(int) (Math.random() * Month.values().length)];
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the month: ");
        String guess = scanner.nextLine().toUpperCase();

        if (guess.equals(month.toString())) {
            System.out.println("Correct! The month is " + month);
        } else {
            System.out.println("Incorrect! The month is " + month);
        }

        scanner.close();
    }
}
