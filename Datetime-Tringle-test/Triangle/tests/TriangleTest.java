import Triangle.Triangle;
import Triangle.Type;

import org.junit.Test;

import static Triangle.Type.*;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void scaleneTest() {
        final Type type = Triangle.classify(1, 2, 3);
        assertEquals(SCALENE, type);
    }

    @Test
    public void invalidTest1() {
        final Type type = Triangle.classify(1, 2, 4);
        assertEquals(INVALID, type);
    }

    @Test
    public void invalidTest2() {
        final Type type = Triangle.classify(1, 4, 2);
        assertEquals(INVALID, type);
    }

    @Test
    public void invalidNegativeTest1() {
        final Type type = Triangle.classify(-1, 1, 1);
        assertEquals(INVALID, type);
    }

    @Test
    public void invalidNegativeTest2() {
        final Type type = Triangle.classify(1, -1, 1);
        assertEquals(INVALID, type);
    }


    @Test
    public void equiliteralTest1() {
        final Type type = Triangle.classify(1, 1, 1);
        assertEquals(EQUILATERAL, type);
    }
    
     @Test
    public void equiliteralTest2() {
        final Type type = Triangle.classify(2, 2, 2);
        assertEquals(EQUILATERAL, type);
    }

    @Test
    public void isocelesTest1() {
        final Type type = Triangle.classify(2, 2, 3);
        assertEquals(ISOSCELES, type);
    }

    @Test
    public void isocelesTest2() {
        final Type type = Triangle.classify(2, 3, 2);
        assertEquals(ISOSCELES, type);
    }

}