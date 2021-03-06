package com.java.app.functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 *
 * @author lilith
 */
public class Lambdas {

    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 4, 8, 9, 12, 0);

        BiggerThanFive bf = new BiggerThanFive();
        for (Integer num : nums) {

            //if number is bigger than five, test returns true and println method prints it
            System.out.println(bf.test(num) ? num : "");
        }

        List<String> armenianWords = Arrays.asList("shun", "door", "dog");

        Predicate<String> hasThreeLetters = word -> word.length() == 3;

        for (String w : armenianWords) {
            System.out.println(hasThreeLetters.test(w));
        }

        //Consumer interface
        Consumer<String> c = a -> System.out.println(a);
        print(c, "hey");

        //Practical example of consumer interface
        Consumer<String> printMany = (a) -> {
            System.out.println(a + " is String ");
            System.out.println(a + " is of length " + a.length());
        };

        //Practical example 2 of consumer interface
        Consumer<String> action = (b) -> {
            b += " 1";
            System.out.println(b + " is String ");
            System.out.println(b + " is of length " + b.length());
        };

        print(printMany, "Example");
        print(action, "Example");

    }

    public static void print(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }

}
