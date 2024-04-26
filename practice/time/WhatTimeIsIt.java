package time;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WhatTimeIsIt {
    public static void main(String[] args) {
        System.out.println("Current time: " + LocalTime.now());
        System.out.println("Current date: " + LocalDate.now());

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss");
        System.out.println("Formatted date and time: " + formatter.format(dateTime));
    }
}
