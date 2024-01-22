package SaturdayJan13.SupplierDemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //Supplier --> accepts nothing but returns a value
        Supplier<String> supplier = () -> "Hello, World";
        String s = supplier.get();
        System.out.println(s.toUpperCase());

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
