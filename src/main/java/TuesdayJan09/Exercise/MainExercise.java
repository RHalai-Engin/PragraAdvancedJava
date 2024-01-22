package TuesdayJan09.Exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {

        //Lambda for Computer
        Computer computer = () -> System.out.println("You can surf Internet using any browser");
        computer.surfInternet();
        //Lambda for Mobile
        Mobile mobile = (num) -> System.out.println("Calling Phone number" + num);
        mobile.call(452148562);
        //Lambda for Vehicle
        Vehicle vehicle = () -> System.out.println("Vehicle is running");
        vehicle.run();
        //Lambda for Greeting
        Greeting spanishGreeting = (greet) -> System.out.println("This is Spanish Greeting" + greet);
        spanishGreeting.greet("Ola");

        //we will take user input and create lambda
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a message: ");
        String nextString = scanner.nextLine();
        //Lambda for Welcome interface
        StringManipulator lowercase = (s) -> nextString.toLowerCase();
        System.out.println(lowercase.apply(nextString));

        StringManipulator uppercase = (s1) -> nextString.toUpperCase();
        System.out.println(uppercase.apply(nextString));

        StringManipulator trim = (s1) -> nextString.trim();
        System.out.println(trim.apply(nextString));

        StringManipulator replaceB = (s1) -> nextString.replace('B', 'T');
        System.out.println(replaceB.apply(nextString));

    }
}
