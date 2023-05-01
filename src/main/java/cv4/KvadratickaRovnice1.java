package cv4;
public class KvadratickaRovnice1 {
    private KvadratickaRovnice rovnice;

    public KvadratickaRovnice1(double a, double b, double c) {
        this.rovnice = new KvadratickaRovnice(a, b, c);
    }

    public double vypocet(double x) {
        return rovnice.vypocet(x);
    }
}