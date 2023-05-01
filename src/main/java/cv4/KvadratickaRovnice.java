package cv4;

public class KvadratickaRovnice {
    private double a, b, c;

    public KvadratickaRovnice(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double vypocet(double x) {
        return a*x*x + b*x + c;
    }
}