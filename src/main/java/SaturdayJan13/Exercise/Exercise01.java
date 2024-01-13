package SaturdayJan13.Exercise;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exercise01 {
    public static void main(String[] args) {
        Consumer<Integer> number=(i)-> System.out.println(i*2);
        number.accept(10);

        Function<Integer, Integer> number2=(i)-> i * 2;
        System.out.println(number2.apply(10));

        System.out.println(multiplication(5));

    }

    public static int multiplication(int a){
        return a * 2;
    }

}

