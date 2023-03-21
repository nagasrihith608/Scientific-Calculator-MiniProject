import org.junit.jupiter.api.Assertions;
import org.junit.Test;



public class CalculatorTest {

    @Test
    public void test_SquareRoot()
    {
        Assertions.assertEquals(1, Calculator.squareRoot(1), 1e-15);
        Assertions.assertEquals(2, Calculator.squareRoot(4), 1e-15);
        Assertions.assertEquals(3, Calculator.squareRoot(9), 1e-15);
        Assertions.assertEquals(4, Calculator.squareRoot(16), 1e-15);
    }

    @Test
    public void testFactorial()
    {
        Assertions.assertEquals(1, Calculator.factorial(0), 1e-15);
        Assertions.assertEquals(1, Calculator.factorial(1), 1e-15);
        Assertions.assertEquals(2, Calculator.factorial(2), 1e-15);
        Assertions.assertEquals(6, Calculator.factorial(3), 1e-15);
    }

    @Test
    public void testLogarithm()
    {
        Assertions.assertEquals(0, Calculator.logarithm(1), 1e-15);
        Assertions.assertEquals(0.6931471805599453, Calculator.logarithm(2), 1e-15);
        Assertions.assertEquals(1.0986122886681098, Calculator.logarithm(3), 1e-15);
        Assertions.assertEquals(1.3862943611198906, Calculator.logarithm(4), 1e-15);
    }

    @Test
    public void testPower()
    {
        Assertions.assertEquals(2, Calculator.power(2, 1), 1e-15);
        Assertions.assertEquals(4, Calculator.power(2, 2), 1e-15);
        Assertions.assertEquals(8, Calculator.power(2, 3), 1e-15);
        Assertions.assertEquals(16, Calculator.power(2, 4), 1e-15);
    }

}
