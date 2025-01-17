package day5;

import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    
    public static void main(String[] args) {
        
        LocalDateTime date = LocalDateTime.now();
        
        System.out.println("Date after 13 days: " + date.plusDays(13));
        System.out.println("Current Date and Time: " + date);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        ZonedDateTime zonedDate = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Current Zoned Date and Time: " + zonedDate);

        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        // duration between two times
        LocalTime starTime = LocalTime.now();
        LocalTime endTime = LocalTime.of(17, 0);

        long duration = Duration.between(starTime, endTime).toMinutes();
        System.out.println("Duration from " + starTime + " to " + endTime + ": " + duration + " minutes");


        //period between start and end dates
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 12, 31);

        // format local date time
        // DateFormat dateFormat = DateFormat.
        // LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
    String text = date.format(formatter);
    System.out.println("Formatted Date: " + text);
    LocalDate parsedDate = LocalDate.parse(text, formatter);
    System.out.println(parsedDate);
        
        Period period = Period.between(startDate, endDate);
        System.out.println("Period from " + startDate + " to " + endDate + ": " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");

    }
}
