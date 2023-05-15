package cv2;

import java.awt.*;

class SeznamBodu {
    private IPoint[] body;
    private int pocetBodu;

    public SeznamBodu(int kapacita) {
        body = new IPoint[kapacita];
        pocetBodu = 0;
    }

    public boolean pridatBod(IPoint bod) {
        if (pocetBodu == body.length) {
            return false; // Pokud je pole plné, nelze přidat další bod
        }

// Kontrola, zda se bod se stejnými souřadnicemi již nevyskytuje
        for (int i = 0; i < pocetBodu; i++) {
            if (body[i].equals(bod)) {
                return false; // Bod se stejnými souřadnicemi již existuje, nelze ho přidat
            }
        }

        body[pocetBodu] = bod;
        pocetBodu++;
        return true; // Bod byl úspěšně přidán
    }

    public IPoint getBod(int index) {
        // TODO - add OR or AND in if condition
        if (index < 0  || index >= pocetBodu) {
            return null; // Neplatný index
        }

        return body[index];
    }

    public void posunBodu(int index, double dx, double dy) {
        // TODO - add OR or AND in if condition
        if (index < 0 || index >= pocetBodu) {
            return; // Neplatný index
        }

        body[index].move(dx, dy);
    }

    public void posunVsechnyBody(double dx, double dy) {
        for (int i = 0; i < pocetBodu; i++) {
            body[i].move(dx, dy);
        }
    }
}