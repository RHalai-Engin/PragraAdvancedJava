package SaturdayJan06.FunctionalInterface.Wish;

public class WellWisher {
    public static void main(String[] args) {
        Greeting englishGreeting = new EnglishGreeting();
        //englishGreeting.greet();

        Greeting hindiGreeting = new HindiGreeting();
        //hindiGreeting.greet();

        greetMe(englishGreeting);
        greetMe(hindiGreeting);
        //over here we are passing a function inside a function
        greetMe(() -> System.out.println("Ola!"));

        //Anonymous Class - Class which does not have a name
        /*Greeting frenchGreeting = new Greeting() {

            @Override
            public void greet() {
                System.out.println("Bonjour!");
            }
        };
        frenchGreeting.greet();
        greetMe(frenchGreeting); */

        //Lambda Function
        Greeting frenchGreeting = () -> System.out.println("Bonjour!");
        frenchGreeting.greet();
    }



    public static void greetMe(Greeting greeting) {
        greeting.greet();
    }
}



//1. Implement an interface with class
//2. Anonymous class
//3. Lambda