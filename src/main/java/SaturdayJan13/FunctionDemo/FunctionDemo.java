package SaturdayJan13.FunctionDemo;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> func = (s) -> s.length();
        System.out.println(func.apply("String"));

        Supplier<LocalDateTime> localDateTime = () -> LocalDateTime.now();
        System.out.println(localDateTime.get());
    }
}
