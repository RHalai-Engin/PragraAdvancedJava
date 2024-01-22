package TuesdayJan09.FunctionalIntfDemo;

import java.util.function.Predicate;

public class FunctionalInterfDemo {
    public static void main(String[] args) {
        //Inbuilt functional interfaces
        //Predicate

        Predicate<Integer> predicate = (i) -> i % 2 == 0;
        //System.out.println(predicate.test(11));
        boolean test = predicate.test(11);
        if(test == true){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }

        Predicate<String> stringTest = (s) -> s.length() > 8;
        System.out.println(stringTest.test("TestMeHere"));

    }
}
