import org.junit.jupiter.api.Assertions;
import org.junit.Test;



public class CalculatorTest {

    @Test
    public void test_SquareRoot_true_positive()
    {
        Assertions.assertEquals(1, Calculator.squareRoot(1), 1e-15);
        Assertions.assertEquals(2, Calculator.squareRoot(4), 1e-15);
        Assertions.assertEquals(3, Calculator.squareRoot(9), 1e-15);
        Assertions.assertEquals(4, Calculator.squareRoot(16), 1e-15);
    }

    @Test
    public void test_SquareRoot_false_positive()
    {
        Assertions.assertNotEquals(5, Calculator.squareRoot(1), 1e-15);
        Assertions.assertNotEquals(546, Calculator.squareRoot(4), 1e-15);
        Assertions.assertNotEquals(35, Calculator.squareRoot(9), 1e-15);
        Assertions.assertNotEquals(47, Calculator.squareRoot(16), 1e-15);
    }

    @Test
    public void testFactorial_true_positive()
    {
        Assertions.assertEquals(1, Calculator.factorial(0), 1e-15);
        Assertions.assertEquals(1, Calculator.factorial(1), 1e-15);
        Assertions.assertEquals(2, Calculator.factorial(2), 1e-15);
        Assertions.assertEquals(6, Calculator.factorial(3), 1e-15);
    }

    @Test
    public void testFactorial_false_positive()
    {
        Assertions.assertNotEquals(13, Calculator.factorial(0), 1e-15);
        Assertions.assertNotEquals(14, Calculator.factorial(1), 1e-15);
        Assertions.assertNotEquals(25, Calculator.factorial(2), 1e-15);
        Assertions.assertNotEquals(67, Calculator.factorial(3), 1e-15);
    }
    @Test
    public void testLogarithm_true_positive()
    {
        Assertions.assertEquals(0, Calculator.logarithm(1), 1e-15);
        Assertions.assertEquals(0.6931471805599453, Calculator.logarithm(2), 1e-15);
        Assertions.assertEquals(1.0986122886681098, Calculator.logarithm(3), 1e-15);
        Assertions.assertEquals(1.3862943611198906, Calculator.logarithm(4), 1e-15);
    }

    @Test
    public void testLogarithm_false_positive()
    {
        Assertions.assertNotEquals(1, Calculator.logarithm(1), 1e-15);
        Assertions.assertNotEquals(40.6931471805599453, Calculator.logarithm(2), 1e-15);
        Assertions.assertNotEquals(16.0986122886681098, Calculator.logarithm(3), 1e-15);
        Assertions.assertNotEquals(17.3862943611198906, Calculator.logarithm(4), 1e-15);
    }
    @Test
    public void testPower_true_positive()
    {
        Assertions.assertEquals(2, Calculator.power(2, 1), 1e-15);
        Assertions.assertEquals(4, Calculator.power(2, 2), 1e-15);
        Assertions.assertEquals(8, Calculator.power(2, 3), 1e-15);
        Assertions.assertEquals(32, Calculator.power(2, 5), 1e-15);
    }

    @Test
    public void testPower_false_positive()
    {
        Assertions.assertNotEquals(22, Calculator.power(2, 1), 1e-15);
        Assertions.assertNotEquals(43, Calculator.power(2, 2), 1e-15);
        Assertions.assertNotEquals(85, Calculator.power(2, 3), 1e-15);
        Assertions.assertNotEquals(38, Calculator.power(2, 5), 1e-15);
    }
}
