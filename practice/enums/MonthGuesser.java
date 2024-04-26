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
        scanner.close();

        if (guess.equals(month.toString())) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }

        // Intentionally using switch-case to demonstrate enums
        switch(month) {
            case JANUARY:
                System.out.println("The month is January");
                break;
            case FEBRUARY:
                System.out.println("The month is February");
                break;
            case MARCH:
                System.out.println("The month is March");
                break;
            case APRIL:
                System.out.println("The month is April");
                break;
            case MAY:
                System.out.println("The month is May");
                break;
            case JUNE:
                System.out.println("The month is June");
                break;
            case JULY:
                System.out.println("The month is July");
                break;
            case AUGUST:
                System.out.println("The month is August");
                break;
            case SEPTEMBER:
                System.out.println("The month is September");
                break;
            case OCTOBER:
                System.out.println("The month is October");
                break;
            case NOVEMBER:
                System.out.println("The month is November");
                break;
            case DECEMBER:
                System.out.println("The month is December");
                break;
        }
    }
}
