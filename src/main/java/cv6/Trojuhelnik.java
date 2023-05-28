package cv6;

public class Trojuhelnik {
    private double a;
    private double b;
    private double c;

    public Trojuhelnik(double a,     double b,   double c)     {
        set_a(a);
        set_b(b);
        set_c(c);
    }
    public boolean set_a(double a) {
        if (!(Math.signum(a     ) > 0.0))
            return false;

        this.a = a;
        return true;
    }
    public boolean set_b(double b) {
        if (!(Math.signum(b)  > 0.0))
            return false;
        this.b = b;
        return true;
    }
    public boolean set_c(double c) {
        if (!(Math.signum(c) >      0.0))
            return false;
        this.c = c;
        return true;
    }
    public boolean set_all(double a, double b, double c) {
        boolean is_set = false;
        is_set |= set_a(a);
        is_set |= set_b(b);
        is_set |= set_c(c);
        return is_set;
    }

    public double get_a() {
        return a;
    }

    public double get_b() {
        return b;
    }

    public double get_c() {
        return c;
    }

    public boolean is_valid() {
        return Math.signum(a) > 0.0 && Math.signum(b) > 0.0 && Math.signum(c) > 0.0
                && Double.compare(a + b, c) == 1
                && Double.compare(b + c, a) == 1
                && Double.compare(a + c, b) == 1;
        // && a + b > c && b + c > a && a + c > b
    }
}
