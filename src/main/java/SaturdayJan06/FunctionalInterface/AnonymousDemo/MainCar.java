package SaturdayJan06.FunctionalInterface.AnonymousDemo;

public class MainCar {
    public static void main(String[] args) {

        //Anonymous classes

        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("Car is running");
            }

            @Override
            public void brake() {
                System.out.println("Braking..");
            }
        };

        vehicle.brake();
        vehicle.run();

    }
}
