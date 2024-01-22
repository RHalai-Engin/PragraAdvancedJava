package SaturdayJan13.FunctionDemo;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionDemo {
    public static void main(String[] args) {

        //Function - accepts of 1 type, returns of another type
        Function<Integer, Integer> number2=(i)-> i * 2;
        System.out.println(number2.apply(10));

        Function<String, Integer> func = (s) -> s.length();
        System.out.println(func.apply("String"));


    }
}
