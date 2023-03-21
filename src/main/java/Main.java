import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Scientific Calculator, Please enter your choice1");
        System.out.println("0. Exit");
        System.out.println("1. Calculate Square root function");
        System.out.println("2. Factorial Function");
        System.out.println("3. Natural Logarithm(base e)");
        System.out.println("4. Power function");

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        double num1, num2;

        while(operation != 0)
        {
            switch (operation)
            {
                case 1:
                    System.out.println("Enter a number");
                    num1 = sc.nextDouble();
                    System.out.println("The Square root of " + num1 + " is " + Calculator.squareRoot(num1));
                    break;

                case 2:
                    System.out.println("Enter a number");
                    num1 = sc.nextDouble();
                    System.out.println("The factorial of " + num1 + " is " + Calculator.factorial(num1));
                    break;


                case 3:
                    System.out.println("Enter a number");
                    num1 = sc.nextDouble();
                    System.out.println("The Natural Logarithm of " + num1 + " is " + Calculator.logarithm(num1));
                    break;

                case 4:
                    System.out.println("Enter a number for the base");
                    num1 = sc.nextDouble();
                    System.out.println("Enter a number for the power");
                    num2 = sc.nextDouble();
                    System.out.println("The Value of " + num1 + " to the power of " + num2 + " is " + Calculator.power(num1, num2));
                    break;

                default:
//                    logger.error("Invalid Choice");
                    break;
            }

            operation = sc.nextInt();
        }
//        logger.info("Exiting Calculator");

    }
}
