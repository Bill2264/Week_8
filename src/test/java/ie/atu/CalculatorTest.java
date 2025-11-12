package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp()
    {
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success()
    {
        assertEquals(20,calc.add(16,4));
    }

    @Test
    public void testAdd_fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.add(Integer.MAX_VALUE,4));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testSub_Success()
    {
        assertEquals(5, calc.sub(13,8));
    }

    @Test
    public void testSub_fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.sub(Integer.MIN_VALUE,13));
        assertEquals("Number cannot be less than or equal to Integer.MIN_VALUE", ex.getMessage());
    }

    @Test
    public void testMulti_Success()
    {
        assertEquals(10,calc.multi(5,2));
    }

    @Test
    public void testMulti_fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.multi(Integer.MAX_VALUE,5));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testDivide_Success()
    {
        assertEquals(2.5,calc.divide(5,2));
    }
    @Test
    public void testDivide_fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.divide(5,0));
        assertEquals("Number cannot be equal to 0", ex.getMessage());
    }
}
