package shape;

import Exceptions.InvalidArguments;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {

    private Square square;
    @Before
    public void setUp() throws InvalidArguments {
        square = Square.create(4);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateAreaShouldCalculateTheAreaOfASquare()throws InvalidArguments {
        assertEquals(16d, square.calculateArea());
    }

    @Test
    public void calculatePerimeterShouldCalculateThePerimeterOfASquare() throws InvalidArguments {
        assertEquals(16d, square.calculatePerimeter());
    }

    @Test
    public void testRectangleShouldThrowExceptionForNegativeSide() throws InvalidArguments {
        thrown.expect(InvalidArguments.class);
        thrown.expectMessage("Invalid Arguments");
        Square square = Square.create(-4);
    }
}
