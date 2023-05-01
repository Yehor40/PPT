package cv4;
public class KvadratickaRovnice2 {
    private double x;

    public KvadratickaRovnice2(double x) {
        this.x = x;
    }

    public double vypocet(KvadratickaRovnice rovnice) {
        return rovnice.vypocet(x);
    }
}