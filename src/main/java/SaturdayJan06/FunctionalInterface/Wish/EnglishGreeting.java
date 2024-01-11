package SaturdayJan06.FunctionalInterface.Wish;

public class EnglishGreeting implements Greeting{
    @Override
    public void greet() {
        System.out.println("Hello! In English");
    }
}
