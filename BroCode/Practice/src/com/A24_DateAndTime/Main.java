package com.A24_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        System.out.println("LocalDate date = LocalDate.now(); -> date "+date);

        LocalTime time = LocalTime.now();
        System.out.println("LocalTime time = LocalTime.now(); -> time: "+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime dateTime = LocalDateTime.now(); -> dateTime:"+dateTime);


        Instant instant = Instant.now();
        System.out.println("Instant instant = Instant.now() -> instant: "+instant);

        System.out.println("\nCUSTOM FORMAT");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

    }
}
