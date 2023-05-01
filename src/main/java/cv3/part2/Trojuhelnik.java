/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv3.part2;

/**
 * Třída Trojuhelnik s konstruktorem a metodami
 * @author T09
 */
public class Trojuhelnik {
        
    private double a;
    private double b;
    private double c;
    
    private double obvod;
    private double obsah;
    
    // -----
 /**
 * Konstruktor
 * @param a prvni cislo
 * @param b druhe cislo
 * @param c treti cislo
 */
    public Trojuhelnik(double a, double b, double c) {
        set_all(a,b,c);
        //set_a(a);
        //set_b(b);
        //set_c(c);
    }
 /**
 * metoda pro zniceni/smazani objektu 
 * @throws Throwable
 */
    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }

/**
 * Predavani hodnot do objektu tr2? 
 * @param o objekt
 * @return this vraci hodnotu obvodu do objektu tr2(this odkazuje na aktuální objekt v metodě nebo konstruktoru)
 */
    @Override
    public boolean equals(Object o) {        
        Trojuhelnik tr2 = (Trojuhelnik) o;
        return this.obvod == tr2.obvod; // pozor na o
    }
/**
 * Vypsání dat z objektu do String
 * @return retezec string s hodnotami z objektu
 */
    @Override
    public String toString() {
        return "" + "a:" + Double.toString(a) + ";b:" + Double.toString(b) 
                + ";c:" + Double.toString(c);
    }
    
    // ----
 /**
 * do promennych obvod a obsah se provede metody ktere vraci hodnoty a hodnoty jsou inicializovany
 */      
    public void calc_obvod_a_obsah_new() {               
    	obvod = calc_obvod();
        double s = calc_obvod() / 2;          
        obsah = calc_obsah(s,a,b,c);          
    }
    
    public void calc_obvod_a_obsah() {
        obvod = get_a() + get_b() + get_c();
        double s = obvod / 2;
        obsah = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
 /**
 * Vypocet obvodu 
 * @return vraci soucet vsech stran
 */   
    public double calc_obvod(){           
        return get_a() + get_b() + get_c(); 
    }
  /**
 * Vypocet obsahu
 * @param obvod predana hodnota obvodu
 * @param a predana hodnota strany A
 * @param b predana hodnota strany B
 * @param c predana hodnota strany C
 * @return vraci vypocet obsahu
 */   
    public double calc_obsah(double obvod, double a, double b, double c){        
        return Math.sqrt(obvod * (obvod - a) * (obvod - b) * (obvod - c));  
    }
//gettery
 /**
 * vraci hodnotu obvod daneho objektu
 * @return vraci hodnotu obvod 
 */  
    public double get_obvod() {    	
        return obvod;
    }
 /**
 * vraci hodnotu obsah daneho objektu
 * @return vraci hodnotu obsah 
 */  
    public double get_obsah() {    	
        return obsah;
    }
 /**
 * Pro kontrolu zda cislo je nula nebo neni (jestli hodnoty jsou splneny pro trojuhelnik)
 * @return vraci hodnotu boolean true 
 */        
    public boolean is_valid() {
        return true 
                && Math.signum(a) > 0.0 && Math.signum(b) > 0.0 && Math.signum(c) > 0.0
                && Double.compare(a + b, c) == 1 
                && Double.compare(b + c, a) == 1 
                && Double.compare(a + c, b) == 1;   
        // && a + b > c && b + c > a && a + c > b 
    }    

    //settery a gettery
/** 
 * nastaveni strany A pro dany objekt + jestli je cislo vetsi nez 0.0 (jinak to nebude trojuhelnik)
 * @return vraci hodnotu boolean true 
 */       
    private boolean set_a(double a) {
        if (!(Math.signum(a) > 0.0))
            return false;
        this.a = a;
        return true;
    }
/** 
 * nastaveni strany B pro dany objekt + jestli je cislo vetsi nez 0.0 (jinak to nebude trojuhelnik)
 * @return vraci hodnotu boolean true 
 */
    private boolean set_b(double b) {
        if (!(Math.signum(b) > 0.0))
            return false;
        this.b = b;
        return true;
    }
 /** 
 * nastaveni strany A pro dany objekt + jestli je cislo vetsi nez 0.0 (jinak to nebude trojuhelnik)
 * @return vraci hodnotu boolean true 
 */   
    private boolean set_c(double c) {
        if (!(Math.signum(c) > 0.0))
            return false;        
        this.c = c;
        return true;
    }
    public void setValueA(double a) throws Exception{
        if (!(Math.signum(a) > 0.0 && Math.signum(b) > 0.0 && Math.signum(c) > 0.0
                && Double.compare(a + b, c) == 1 
                && Double.compare(b + c, a) == 1 
                && Double.compare(a + c, b) == 1)) {
            throw new NotTrojuhelnikException("Neni to trojuhelnik.");
        } else {
            this.a=a;
        }
    }
    
    public void setValueB(double b) throws Exception{
        if (!(Math.signum(a) > 0.0 && Math.signum(b) > 0.0 && Math.signum(c) > 0.0
                && Double.compare(a + b, c) == 1 
                && Double.compare(b + c, a) == 1 
                && Double.compare(a + c, b) == 1)) {
            throw new NotTrojuhelnikException("Neni to trojuhelnik.");
        } else {
            this.b=b;
        }
    }
    
    public void setValueC(double c) throws Exception{
        if (!(Math.signum(a) > 0.0 && Math.signum(b) > 0.0 && Math.signum(c) > 0.0
                && Double.compare(a + b, c) == 1 
                && Double.compare(b + c, a) == 1 
                && Double.compare(a + c, b) == 1)) {
            throw new NotTrojuhelnikException("Neni to trojuhelnik.");
        } else {
            this.c=c;
        }
    }
/** 
 * zjisteni zda vsechny strany splnuje podminku pro trojuhelnik z metod (set_a/b/c) pote nastavi hodnoty 
 * @return vraci hodnotu boolean true 
 */
    private boolean set_all(double a, double b, double c) {        
        //return set_a(a) || set_b(b) || set_c(c);
        boolean is_set = false;
        is_set |= set_a(a);
        is_set |= set_b(b);
        is_set |= set_c(c); 
        if (!(Math.signum(a) > 0.0 && Math.signum(b) > 0.0 && Math.signum(c) > 0.0
                && Double.compare(a + b, c) == 1 
                && Double.compare(b + c, a) == 1 
                && Double.compare(a + c, b) == 1))
            return false;         
        return is_set;
    }
//gettery
 /** 
 * metoda pro vraceni hodnot strany A
 * @return vraci hodnotu strany a
 */  
    public double get_a() {
        return a;
    }
  /** 
 * metoda pro vraceni hodnot strany B
 * @return vraci hodnotu strany b
 */     
    public double get_b() {
        return b;
    }
   /** 
 * metoda pro vraceni hodnot strany C
 * @return vraci hodnotu strany c
 */        
    public double get_c() {
        return c;
    }    
    
}
