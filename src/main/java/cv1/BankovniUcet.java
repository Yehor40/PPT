package cv1;

import cv1.Exceptions.NedostatekProstredkuException;
import cv1.Exceptions.PrekrocenLimitException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BankovniUcet {
    private int aktualniStav;
    private BankovniUcetNastaveni nastaveni;
    private List<Vklad> historieVkladu;
    private List<Vyber> historieVyberu;

    public BankovniUcet(int pocatecniStav, int denniLimit) {
        this.aktualniStav = pocatecniStav;
        this.nastaveni = new BankovniUcetNastaveni(denniLimit);
        this.historieVkladu = new ArrayList<>();
        this.historieVyberu = new ArrayList<>();
    }

    public void vklad(int castka) {
        this.aktualniStav += castka;
        this.historieVkladu.add(new Vklad(new Date(), castka));
    }

    public void vyber(int castka) throws NedostatekProstredkuException, PrekrocenLimitException {
            if (castka > this.aktualniStav) {
                throw new NedostatekProstredkuException("Na účtu není dostatek peněz");
            }

            if (!this.nastaveni.verifyDenniLimit(castka, this.getHistorieVyberu())) {
                throw new PrekrocenLimitException("Byl překročen denní limit výběru");
            }

            this.aktualniStav -= castka;
            this.historieVyberu.add(new Vyber(new Date(), castka));

    }

    public List<Vklad> getHistorieVkladu() {
        return this.historieVkladu;
    }

    public List<Vyber> getHistorieVyberu() {
        return this.historieVyberu;
    }

    public int getAktualniStav() {
        return this.aktualniStav;
    }
}


