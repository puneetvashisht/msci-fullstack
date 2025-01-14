package day4;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExistingFunctionalInterfaces {
    public static void main(String[] args) {
        
        Predicate<String> predicate = (s) -> s.length() > 1;
        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test(""));

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        Integer length = biFunction.apply("a", "xyz");
        System.out.println("length: " + length);

        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("xuz");
        
        Function<String, Integer> function = (a) -> a.length();
        Integer stringLength = function.apply("abcdef");
        System.out.println(stringLength);


    }
}
