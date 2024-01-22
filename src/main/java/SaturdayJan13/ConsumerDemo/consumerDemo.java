package SaturdayJan13.ConsumerDemo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumerDemo {
    public static void main(String[] args) {
        //Consumer
        Consumer<Integer> number=(i)-> System.out.println(i*2);
        number.accept(10);
        //BiConsumer
        BiConsumer<String, String> biConsumer= (x, y) -> {
            System.out.println(y);
            System.out.println(x);
        };
        biConsumer.accept("Pragra", "Class");
    }
}
