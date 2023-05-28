/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv3.part2;

public class TrojuhelnikDouble {

    private Trojuhelnik tr1;
    private Trojuhelnik tr2;

    public TrojuhelnikDouble(Trojuhelnik tr1, Trojuhelnik tr2) {
        this.tr1 = tr1;
        this.tr2 = tr2;
    }

 public Trojuhelnik minObvod() {
        return tr1.get_obvod() < tr2.get_obvod() ? tr1 : tr2;        
    }

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

    @Override
    public String toString() {
        return "Tr1:" + tr1.toString() + ";Tr2:" + tr2.toString();
    }   

    Trojuhelnik minObvod(Trojuhelnik tr1, Trojuhelnik tr2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
}
