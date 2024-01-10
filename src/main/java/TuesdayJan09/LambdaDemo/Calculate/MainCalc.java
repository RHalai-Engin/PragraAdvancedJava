package TuesdayJan09.LambdaDemo.Calculate;

public class MainCalc {
    public static void main(String[] args) {
        /*
        public interface Calculator {
          double calculate(double a, double b);
}
         */
        //Addition
        Calculator addition = (num1, num2) ->  num1 + num2;
        System.out.println(addition.calculate(10, 20));
        //Multiplication
        Calculator multiplication = (num1, num2) ->  num1 * num2;
        System.out.println(multiplication.calculate(10, 20));
        //Subtraction
        Calculator subtraction = (num1, num2) ->  num1 - num2;
        System.out.println(subtraction.calculate(10, 20));
        //Division
        Calculator division = (num1, num2) ->  num1 / num2;
        System.out.println(division.calculate(10, 20));

        /*
        Please implement the same for division, multiplication and sub
        10 mins.

         */
    }
}

