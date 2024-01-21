package TuesdayJan09.Exercise;

public class MainExercise {
    public static void main(String[] args) {

        //Lambda for Computer
        Computer computer = () -> System.out.println("You can surf Internet using any browser");
        computer.surfInternet();
        //Lambda for Mobile
        Mobile mobile = (num) -> System.out.println("Calling Phone number..");
        mobile.call(452148562);
        //Lambda for Vehicle
        Vehicle vehicle = () -> System.out.println("Vehicle is running");
        vehicle.run();
        //Lambda for Greeting
        Greeting spanishGreeting = (greet) -> System.out.println("This is Spanish Greeting");
        spanishGreeting.greet("Ola");
    }
}
