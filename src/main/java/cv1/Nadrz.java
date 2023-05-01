package cv1;

import cv1.Exceptions.PlnaNadrzException;
import cv1.Exceptions.PrazdnaNadrzException;

public class Nadrz {
    private int kapacita ;
    private int stav ;

    public Nadrz(int kapacita, int stav) {
        this.kapacita = kapacita;
        this.stav = stav;
    }

    public void pridej(int amount) throws PlnaNadrzException {
        if (this.stav + amount > this.kapacita) {
            throw new PlnaNadrzException("Nádrž je plná");
        }
        this.stav += amount;
    }

    public void odeber(int amount) throws PrazdnaNadrzException {
        if (this.stav - amount < 0) {
            throw new PrazdnaNadrzException("Nádrž je prázdná");
        }
        this.stav -= amount;
    }

    public int getStav() {
        return this.stav;
    }

    public int getKapacita() {
        return this.kapacita;
    }
}