import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
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
                    logger.info("[SQRT] - " + num1);
                    logger.info("[RESULT - SQRT] - " + Calculator.squareRoot(num1));
//                    logger.info("The Square root of " + num1 + " is " + Calculator.squareRoot(num1));
                    break;

                case 2:
                    System.out.println("Enter a number");
                    num1 = sc.nextDouble();
                    logger.info("[FACTORIAL] - " + num1);
                    logger.info("[RESULT - FACTORIAL] - " + Calculator.factorial(num1));
//                    logger.info("The factorial of " + num1 + " is " + Calculator.factorial(num1));
                    break;


                case 3:
                    System.out.println("Enter a number");
                    num1 = sc.nextDouble();
                    logger.info("[LOG] - " + num1);
                    logger.info("[RESULT - LOG] - " + Calculator.logarithm(num1));
//                    logger.info("The Natural Logarithm of " + num1 + " is " + Calculator.logarithm(num1));
                    break;

                case 4:
                    System.out.println("Enter a number for the base");
                    num1 = sc.nextDouble();
                    System.out.println("Enter a number for the power");
                    num2 = sc.nextDouble();
                    logger.info("[POWER] - " + num1 + ", " + num2);
                    logger.info("[RESULT - POWER] - " + Calculator.power(num1, num2));
//                    logger.info("The Value of " + num1 + " to the power of " + num2 + " is " + Calculator.power(num1, num2));
                    break;

                default:
                    logger.error("Invalid Choice");
                    break;
            }

            operation = sc.nextInt();
        }
        logger.info("Exiting Calculator");
    }
}
