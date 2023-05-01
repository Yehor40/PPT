package cv1_2;

import java.util.List;
@SuppressWarnings("all")

public class BankovniUcetNastaveni {
    private int denniLimit;

    public BankovniUcetNastaveni(int denniLimit) {
        this.denniLimit = denniLimit;
    }

    public int getDenniLimit() {
        return denniLimit;
    }

    public boolean verifyDenniLimit(int castka, List<Vyber> historieVyberu) {
//        OvereniLimitu overeniLimitu = new OvereniLimitu(denniLimit);
//        if (overeniLimitu.jeLimitPresazen(castka, historieVyberu)) {
//            return false;
//        } else {
//            return true;
//        }
        return true;
    }
}
