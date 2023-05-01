/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv3.part2;

/**
 * Třída TrojuhelnikDouble s konstruktorem a metodami
 * @author T09
 */
public class TrojuhelnikDouble {

    private Trojuhelnik tr1;
    private Trojuhelnik tr2;
/**
 * Konstruktor pro dva objekty
 * @param tr1 prvni objekt
 * @param tr2 druhy objekt
 */
    public TrojuhelnikDouble(Trojuhelnik tr1, Trojuhelnik tr2) {
        this.tr1 = tr1;
        this.tr2 = tr2;
    }
    
 /**
 * Metoda pro zjisteni mensiho trojuhelniku
 * @return vraci objekt(trojuhelnik) ktery je mensi
 */
 public Trojuhelnik minObvod() {
        return tr1.get_obvod() < tr2.get_obvod() ? tr1 : tr2;        
    }
/**
 * Metoda pro zjisteni, zda jsou objekty stejne 
 * @return vraci bud true nebo false
 */
public boolean are_equals() {
        return tr1.equals(tr2);
    }
        
 /**
 * metoda pro zniceni/smazani objektu 
 * @throws Throwable
 */
    @Override
    public void finalize() throws Throwable {
        super.finalize();
        tr1.finalize();
        tr1 = null;
        tr2.finalize();
        tr2 = null;
    }
    
/**
 * Vypsání dat z objektu do String
 * @return retezec string s hodnotami z objektu
 */
    @Override
    public String toString() {
        return "Tr1:" + tr1.toString() + ";Tr2:" + tr2.toString();
    }   

    Trojuhelnik minObvod(Trojuhelnik tr1, Trojuhelnik tr2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
