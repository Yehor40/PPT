package cv2;

public class SeznamBodu {
    private Point[] body;
    private int pocetBodu;

    public SeznamBodu(int kapacita) {
        body = new Point[kapacita];
        pocetBodu = 0;
    }

    public boolean pridatBod(Point bod) {
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

    public Point getBod(int index) {
        if (index < 0  && index >= pocetBodu) {
            return null; // Neplatný index
        }

        return body[index];
    }

    public void posunBodu(int index, double dx, double dy) {
        if (index < 0 && index >= pocetBodu) {
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