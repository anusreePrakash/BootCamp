package march_16;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @Test
    public void testRectangleCanCalculateItsArea() throws Exception {
        Rectangle rectangle = Rectangle.create(10,4);
        assertEquals(40,rectangle.calcArea());
    }
    @Test
    public void testRectangleShouldThrowExceptionForNegativeWidth(){
        try{
            Rectangle rectangle = Rectangle.create(-10,4);
        }catch(IllegalArgumentException err) {
            assertEquals(err.getMessage(), "Width should be a positive Integer greater than zero");
        }
    }
    @Test
    public void testRectangleShouldThrowExceptionForNegativeHeight(){
        try{
            Rectangle rectangle = Rectangle.create(10,-4);
        }catch(IllegalArgumentException err) {
            assertEquals(err.getMessage(), "Height should be a positive Integer greater than zero");
        }
    }


}