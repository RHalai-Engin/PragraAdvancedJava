package TuesdayJan09.LambdaDemo;

public class TestAnimal {
    public static void main(String[] args) {
        //Implemented class
        /*Animal animal = new Dog();
        callAnimal(() -> System.out.println("Animal is eating"));*/

        Animal animal = () -> System.out.println("Animal is eating"); // This is lambda

    }
    /*public static void callAnimal (Animal animal){
        System.out.println("Animal...");
    }*/
}

//1. Implemented class
//2. Anonymous class
//3. Lambda
