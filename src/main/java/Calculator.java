import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
        logger.info("Calculator Initialised");
    }

    public static Double squareRoot(double x){
        Double result = 0.0;
        try
        {
            if(x < 0)
            {
                result = null;
                throw new Exception("The input for square root cannot be negative");
            }
            else
            {
                result = Math.sqrt(x);
                logger.info("[SQRT] - " + x);
                logger.info("[RESULT - SQRT] - " + result);

            }
        } catch (Exception e) {
            logger.error(e);
        }


        return result;
    }

    public static Double factorial(double x)
    {
        Double result = 0.0;
        try
        {
            if(x < 0)
            {
                result = null;
                throw new Exception("The input for square root cannot be negative");
            }
            else
            {
                result = 1.0;
                for(int i = 2;i <= x;i++)
                {
                    result = result*i;
                }
                logger.info("[FACTORIAL] - " + x);
                logger.info("[RESULT - FACTORIAL] - " + result);

            }
        } catch (Exception e) {
            logger.error(e);
        }


        return result;
    }

    public static Double logarithm(double x)
    {
        Double result = 0.0;
        try
        {
            if(x < 0)
            {
                result = null;
                throw new Exception("The input for Logarithm cannot be negative");
            } else if (x == 0) {
                result = null;
                throw new Exception("The input for Logarithm cannot be 0");
            } else
            {
                result = Math.log(x);
                logger.info("[LOG] - " + x);
                logger.info("[RESULT - LOG] - " + result);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return result;
    }

    public static Double power(double x, double y)
    {
        Double result = Math.pow(x, y);
        logger.info("[POWER] - " + x + ", " + y);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
}
