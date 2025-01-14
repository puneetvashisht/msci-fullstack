package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortDemo {

    public static void main(String[] args) {
        
        List<Book> books1 = DataExtractor.getFromAmazon("amazon");
        List<Book> books2 =  DataExtractor.getFromBarnesAndNoble("bn");

        Set<Book> allBooks = new TreeSet<>((b1, b2)-> b1.getRating().compareTo(b2.getRating()));
        
        allBooks.addAll(books1);
                allBooks.addAll(books2);
        for(Book b: allBooks){
            System.out.println(b);
        }

       

        // System.out.println(allBooks);

        // Collections.sort(allBooks);

        // // for(Book b : allBooks){
        // //     System.out.println(b);
        // // }

        // // Collections.sort(allBooks, new PriceComparator());
        // // Collections.sort(allBooks, (b1, b2)-> b2.getPrice().compareTo(b1.getPrice()));
        // Collections.sort(allBooks, (b1, b2)-> b1.getRating().compareTo(b2.getRating()));

        // for(Book b : allBooks){
        //     System.out.println(b);
        // }

        // Collections.sort(allBooks, new Comparator<Book>() {
        //     @Override
        //     public int compare(Book o1, Book o2) {
        //         // return (int)(o1.getPrice() - o2.getPrice());
        //         return o1.getPrice().compareTo(o2.getPrice());
        //     }
        // });

        allBooks.stream()
        .sorted((b1, b2)-> b1.getRating().compareTo(b2.getRating()))
        .forEach(e-> System.out.println(e));

    }

}
