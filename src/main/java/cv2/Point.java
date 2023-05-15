package cv2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Rozhraní třídy Point
 interface IPoint {
    void move(double dx, double dy);
    void movedxdy(double dx, double dy);
    String toString();
}


public class Point implements IPoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void movedxdy(double dx, double dy) {
        x = dx;
        y = dy;
    }

    @Override
    public String toString() {
        return "Point: x=" + x + ", y=" + y;
    }
}


// Testovací třída pro třídu Point


// Testovací třída pro třídu Trojuhelnik
class TrojuhelnikTest {
    // Implementace testů pro třídu Trojuhelnik
}