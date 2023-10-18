package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Date;

public class FormatDates {

    public static void main(String[] args) {
        //test output for localdate.now()
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Today is: " +today);

        //specify the date/time format I want to use
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = today.format(fmt2);
        System.out.println(formattedDate2);
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedDate3 = today.format(fmt3);
        System.out.println(formattedDate3);
        System.out.println(today.getDayOfWeek() + "," + formattedDate3 + " " + time.getHour() + ":" + time.getMinute());
    }

}
