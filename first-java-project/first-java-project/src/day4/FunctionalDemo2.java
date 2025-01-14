package day4;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalDemo2 {

    public static void main(String[] args) {
        
        List<Book> books = DataExtractor.getFromAmazon("amazon");

        List<Book> matchingBooks = books.stream()
        .filter((b)->b.getRating()>4.5 && b.getPrice()< 50.0)
        // .forEach((b)-> System.out.println(b));
        .collect(Collectors.toList());

        System.out.println(matchingBooks);

        boolean result = books.stream()
        .anyMatch(b -> b.getTitle().equals("Python 1"));

        System.out.println("Found book  " + result);
    }

}
