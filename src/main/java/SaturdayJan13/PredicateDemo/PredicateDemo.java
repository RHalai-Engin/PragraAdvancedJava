package SaturdayJan13.PredicateDemo;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //Predicate
        Predicate<Integer> div2 = (s) -> s%2 ==0; // 20 / 2 = 0 --> remainder
        Predicate<Integer> div3 = (s) -> s%3 ==0; // 20 / 3 = 2 --> remainder
        //Predicate and method
        boolean result= div2.and(div3).test(20);
        System.out.println(result);
        //Predicate or method
        boolean result2= div2.or(div3).test(19);
        System.out.println(result2);
        //Predicate negate method (it means not. it will return the opposite of the output.
        // this case condition is false but it will return true)
        boolean result3= div2.negate().test(9);
        System.out.println(result3);
    }
}
