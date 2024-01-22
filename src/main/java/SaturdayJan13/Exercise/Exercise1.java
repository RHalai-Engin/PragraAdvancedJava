package SaturdayJan13.Exercise;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercise1 {
    public static void main(String[] args) {
        //Consumer which double each element give to it
        Consumer<Double> cons = (i) -> System.out.println(i * 2);
        cons.accept(5.0);

        //Predicate to check if the given string is palindrome
        Predicate<String> palindrome = (i) -> {
            int start = 0;
            int end = i.length() -1;
            while(start < end){
                if (i.charAt(start) != i.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;

            /* This way of doing it will make our code more consice and short
            Predicate<String> predicate = (s) -> {
                StringBuilder newS = new StringBuilder();
                StringBuilder reverse = newS.reverse();
                String reverse = newS.reverse().toString(); //this is another way of writing line 29
                boolean result = s.equals(reverse);
                return result;
            };*/
        };
        //System.out.println(predicate.test("check"));
        System.out.println(palindrome.test("racecar"));

        //Function to calculate the area based on given radius circle or square or rectangle
        Function<Double, Double> calculateCircle = (i) -> Math.PI * i * i;
        System.out.println("Area of Circle: " + calculateCircle.apply(5.0));
        Function<Double, Double> calculateSquare = (side) -> side * 4;
        System.out.println(calculateSquare.apply(4.0));
        Function<Double, Double> calculateRect = (length) -> length * length;
        System.out.println(calculateRect.apply(3.0));
    }
}
