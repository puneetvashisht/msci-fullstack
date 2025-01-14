package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {
        
        List<Book> books1 = DataExtractor.getFromAmazon("amazon");
        List<Book> books2 =  DataExtractor.getFromBarnesAndNoble("bn");

        List<Book> allBooks = new ArrayList<>();
        allBooks.addAll(books1);
        allBooks.addAll(books2);

        System.out.println(allBooks);

        Collections.sort(allBooks);

        // for(Book b : allBooks){
        //     System.out.println(b);
        // }

        // Collections.sort(allBooks, new PriceComparator());
        Collections.sort(allBooks, (b1, b2)-> b1.getPrice().compareTo(b2.getPrice()));

        for(Book b : allBooks){
            System.out.println(b);
        }

    }

}
