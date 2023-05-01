/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv3.part1;


public class Trojuhelnik {
        
    private double a;
    private double b;
    private double c;
    
    private double obvod;
    private double obsah;
    

    public Trojuhelnik(double a, double b, double c) {
        set_a(a);
        set_b(b);
        set_c(c);
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }


    @Override
    public boolean equals(Object o) {        
        Trojuhelnik tr2 = (Trojuhelnik) o;
        return this.obvod == tr2.obvod;
    }

    @Override
    public String toString() {
        return "" + "a:" + Double.toString(a) + ";b:" + Double.toString(b) 
                + ";c:" + Double.toString(c);
    }
    


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

    public double calc_obvod(){           
        return get_a() + get_b() + get_c(); 
    }

    public double calc_obsah(double obvod, double a, double b, double c){        
        return Math.sqrt(obvod * (obvod - a) * (obvod - b) * (obvod - c));  
    }

    public double get_obvod() {    	
        return obvod;
    }

    public double get_obsah() {    	
        return obsah;
    }

    public boolean is_valid() {
        return true 
                && Math.signum(a) > 0.0 && Math.signum(b) > 0.0 && Math.signum(c) > 0.0
                && Double.compare(a + b, c) == 1 
                && Double.compare(b + c, a) == 1 
                && Double.compare(a + c, b) == 1;   
    }


    private boolean set_a(double a) {
        if (!(Math.signum(a) > 0.0))
            return false;
        this.a = a;
        return true;
    }

    private boolean set_b(double b) {
        if (!(Math.signum(b) > 0.0))
            return false;
        this.b = b;
        return true;
    }

    private boolean set_c(double c) {
        if (!(Math.signum(c) > 0.0))
            return false;        
        this.c = c;
        return true;
    }    

    private boolean set_all(double a, double b, double c) {        
        boolean is_set = false;
        is_set |= set_a(a);
        is_set |= set_b(b);
        is_set |= set_c(c);        
        return is_set;
    }

    public double get_a() {
        return a;
    }

    public double get_b() {
        return b;
    }

    public double get_c() {
        return c;
    }    
    
}
