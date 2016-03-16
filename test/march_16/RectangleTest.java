package march_16;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @Test
    public void testRectangleCanCalculateItsArea() throws IllegalArgumentException {
        Rectangle rectangle = Rectangle.create(10,4);
        assertEquals(40d,rectangle.calculateArea());
    }

    @Test
    public void testRectangleCanCalculateItsPerimeter() throws IllegalArgumentException {
        Rectangle rectangle = Rectangle.create(10,4);
        assertEquals(28d,rectangle.calculatePerimeter());
    }
}