package cv2;

interface ITrojuhelnik {
    void move(double dx, double dy);
    void movedxdy(double dx, double dy);
    String toString();
}

public class Trojuhelnik implements ITrojuhelnik {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
        return "Trojuhelnik: x=" + x + ", y=" + y;
    }
}
