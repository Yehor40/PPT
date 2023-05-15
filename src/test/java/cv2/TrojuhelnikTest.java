package cv2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrojuhelnikTest {

    @Test
    public void testMove() {
        Trojuhelnik trojuhelnik = new Trojuhelnik();
        trojuhelnik.move(2.5, -1.0);
        Assertions.assertEquals(2.5, trojuhelnik.getX());
        Assertions.assertEquals(-1.0, trojuhelnik.getY());
    }

    @Test
    public void testMoveDxDy() {
        Trojuhelnik trojuhelnik = new Trojuhelnik();
        trojuhelnik.movedxdy(5.0, 6.0);
        Assertions.assertEquals(5.0, trojuhelnik.getX());
        Assertions.assertEquals(6.0, trojuhelnik.getY());
    }

    @Test
    public void testToString() {
        Trojuhelnik trojuhelnik = new Trojuhelnik();
        String expectedString = "Trojuhelnik: x=0.0, y=0.0";
        Assertions.assertEquals(expectedString, trojuhelnik.toString());
    }
}