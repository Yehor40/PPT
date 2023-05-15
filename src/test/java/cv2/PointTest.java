package cv2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void testMove() {
        Point point = new Point(2.0, 3.0);
        point.move(1.5, -2.0);
        Assertions.assertEquals(3.5, point.getX());
        Assertions.assertEquals(1.0, point.getY());
    }

    @Test
    public void testMoveDxDy() {
        Point point = new Point(2.0, 3.0);
        point.movedxdy(5.0, 6.0);
        Assertions.assertEquals(5.0, point.getX());
        Assertions.assertEquals(6.0, point.getY());
    }

    @Test
    public void testToString() {
        Point point = new Point(2.0, 3.0);
        String expectedString = "Point: x=2.0, y=3.0";
        Assertions.assertEquals(expectedString, point.toString());
    }
}