package cv2;

import java.awt.*;

class Trojuhelnik implements ITrojuhelnik {
    private double a;
    private double b;
    private double c;
    private IPoint souradnice;

    public Trojuhelnik(double a, double b, double c, IPoint souradnice) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.souradnice = souradnice;
    }

    public void move(double dx, double dy) {
        souradnice.move(dx, dy);
    }

    public void movedxdy(double dx, double dy) {
        souradnice.movedxdy(dx, dy);
    }

    public String toString() {
        return "Trojuhelnik: {" + "a=" + a + ";b=" + b + ";c=" + c + "}, " + souradnice.toString();
    }

    public IPoint getSouradnice() {
        return souradnice;
    }
}