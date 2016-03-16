package shape;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class RectangleTest {

    @Test
    public void calculateAreaCanCalculateRectangleArea() throws IllegalArgumentException {
        Rectangle rectangle = Rectangle.create(10, 4);
        assertEquals(40d, rectangle.calculateArea());
    }

    @Test
    public void calculatePerimeterCanCalculateRectanglePerimeter() throws IllegalArgumentException {
        Rectangle rectangle = Rectangle.create(10, 4);
        assertEquals(28d, rectangle.calculatePerimeter());
    }

    @Test
    public void testRectangleShouldThrowExceptionForNegativeWidth() throws IllegalArgumentException {
        try {
            Rectangle rectangle = Rectangle.create(-10, 4);
        }catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "illegal arguments");
        }
    }
}
