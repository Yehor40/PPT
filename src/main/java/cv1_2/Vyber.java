package cv1_2;

import java.util.Date;

public class Vyber {
    private Date datum;
    private int kolik;

    public Vyber(Date datum, int kolik) {
        this.datum = datum;
        this.kolik = kolik;
    }

    public Date getDatum() {
        return this.datum;
    }

    public int getKolik() {
        return this.kolik;
    }
}
