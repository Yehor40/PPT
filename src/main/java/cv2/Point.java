package cv2;

// Rozhraní třídy Point
 interface IPoint {
    void move(double dx, double dy);
    void movedxdy(double dx, double dy);
    String toString();
}

// Rozhraní třídy Trojuhelnik
interface ITrojuhelnik {
    void move(double dx, double dy);
    void movedxdy(double dx, double dy);
    String toString();
}

// Testovací třída pro třídu Point
class PointTest {
    // Implementace testů pro třídu Point
}

// Testovací třída pro třídu Trojuhelnik
class TrojuhelnikTest {
    // Implementace testů pro třídu Trojuhelnik
}