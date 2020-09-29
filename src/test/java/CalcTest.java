import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {


    @Test
    public void testPlus() {
        Calc plus = new Plus(1, 2);
        Assertions.assertEquals(3.0, plus.calc());
    }

    @Test
    public void testMinus() {
        Calc minus = new Minus(1.9, 4.5);
        Assertions.assertEquals(-2.6, minus.calc());
    }

    @Test
    public void testMultiply() {
        Calc multiply = new Multiply(7.6, -4.4);
        Assertions.assertEquals(28.0, multiply.calc());
    }

    @Test
    public void testDivision() {
        Calc division = new Division(8.99, 8.99);
        Assertions.assertEquals(1.0, division.calc());
    }

    @Test
    public void testDivisionByZero() {
        Calc division = new Division(8.99, 0);
        Assertions.assertEquals("You can't divide by zero. Rerun the program. Enter 2 numbers and any from following operators (+, -, *, /).",
                division.calc());
    }

    @Test
    public void testBoundaryValues() {
        Calc plus = new Plus(1.7976931348623158E+308, 1.7976931348623157E+308);
        Assertions.assertEquals("Number shouldn't exceed 1.7976931348623157E+308.", plus.calc());
    }
}
