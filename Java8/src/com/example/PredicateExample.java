package com.example;

import java.util.function.Predicate;

/**
 * Has only one method test
 * Accepts only one argument and returns boolean value
 */
public class PredicateExample {

    public static void main(String[] args) {
        int []x = new int[] {1, 2, 10, 15, 32, 12, 23};
        Predicate<Integer> evenNumPredicate = (a) -> a%2==0;
        Predicate<Integer> gtPredicate = (a) -> a > 10;
        System.out.println("Even numbers are: ");
        m1(evenNumPredicate, x);
        System.out.println("Numbers greater than 10 are: ");
        m1(gtPredicate, x);
        System.out.println("Numbers greater than 10 AND even are: ");
        m1(gtPredicate.and(evenNumPredicate), x);
        System.out.println("Numbers greater than 10 OR even are: ");
        m1(gtPredicate.or(evenNumPredicate),x);
        System.out.println("Numbers less than 10 are: ");
        m1(gtPredicate.negate(), x);
    }

    public static void m1(Predicate<Integer> p, int []x) {
        for(int i=0; i < x.length; i++) {
            if(p.test(x[i])) {
                System.out.print(x[i]+" ");
            }
        }
        System.out.println();
    }
}
