package shape;

import Exceptions.InvalidArguments;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;
    @Before
    public void setUp() throws InvalidArguments {
        rectangle = Rectangle.create(10, 4);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void calculateAreaShouldCalculateTheAreaOfARectangle()throws InvalidArguments {
        assertEquals(40d, rectangle.calculateArea());
    }

    @Test
    public void calculatePerimeterShouldCalculateThePerimeterOfARectangle() throws InvalidArguments {
        assertEquals(28d, rectangle.calculatePerimeter());
    }

    @Test
    public void testRectangleShouldThrowExceptionForNegativeHeightOrWidth() throws InvalidArguments {
        thrown.expect(InvalidArguments.class);
        thrown.expectMessage("Invalid Arguments");
        Rectangle rectangle = Rectangle.create(-10, 4);
    }
}
