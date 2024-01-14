package SaturdayJan06.Exercise;

public class BankMain {
    public static void main(String[] args) {
        Bank customer =  () -> System.out.println("This is your saving account");
        customer.saving();

        Bank customer1 = () -> System.out.println("This is your high interest saving account");
        customer1.saving();

        Bank customer2 = () -> System.out.println("This is your US DOLLAR high interest saving account");
        customer2.saving();
    }
}
