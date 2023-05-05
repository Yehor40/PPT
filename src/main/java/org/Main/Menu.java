package org.Main;

import cv1.BankovniUcet;
import cv1.CalcFaktorial;
import cv1.Exceptions.NedostatekProstredkuException;
import cv1.Exceptions.PlnaNadrzException;
import cv1.Exceptions.PrazdnaNadrzException;
import cv1.Exceptions.PrekrocenLimitException;
import cv1.Nadrz;
import cv3.part1.Trojuhelnik;
import cv3.part1.TrojuhelnikDouble;
import cv4.KvadratickaRovnice1;
import cv4.KvadratickaRovnice2;
import cv4.KvadratickaRovnice3;
import cv6.CodeCleaner;
import cv7.Vypocet_Histogram;
import cv9.CalcFibonacci;

import java.io.IOException;

public class Menu {
    static final CalcFaktorial calcf1 = new CalcFaktorial();
    static final  CalcFaktorial calcf2 = new CalcFaktorial();
    static final BankovniUcet ucet = new BankovniUcet(1000,200);
    static final Nadrz nadrz = new Nadrz(1000,100);
    static final Trojuhelnik t1 = new Trojuhelnik(16.0, 12.0, 20.0);
    static final Trojuhelnik t2 = new Trojuhelnik(2.5, 4.6, 6.4);
    static final  Trojuhelnik tr1 = new Trojuhelnik(0, 4.0, 5.0);
    static final Trojuhelnik tr2 = new Trojuhelnik(2.5, 4.6, 6.4);
    static final TrojuhelnikDouble trojuhelnikDouble = new TrojuhelnikDouble(tr1, tr2);
    static final TrojuhelnikDouble trojuhelnikDouble1 = new TrojuhelnikDouble(t1, t2);
    static final CalcFibonacci fib = new CalcFibonacci();
    public  void cv3_part1(){
        System.out.print(tr1.is_valid());
        tr1.calc_obvod_a_obsah();
        tr2.calc_obvod_a_obsah();
        System.out.println(""+trojuhelnikDouble.toString());
    }
    public  void cv3_part2(){
        System.out.println(t2.is_valid());
        t1.calc_obvod_a_obsah();
        t2.calc_obvod_a_obsah();
        //tr1.setValueA(17);
        System.out.println(""+trojuhelnikDouble1.toString());
    }
    public  void cv1() {
        calcf1.calc1(6);
        calcf2.calc2(9);
        try {
            ucet.vklad(100);
            ucet.vyber(50);
            ucet.vyber(201);
            ucet.vklad(1200);
        } catch (NedostatekProstredkuException e) {
            throw new RuntimeException(e);
        } catch (PrekrocenLimitException e) {
            throw new RuntimeException(e);
        }
        System.out.printf(String.valueOf(ucet.getAktualniStav())+"\n");
        System.out.println(ucet.getHistorieVyberu());
        System.out.println(ucet.getHistorieVkladu());
        try {
            nadrz.pridej(100);
            nadrz.odeber(158);
            nadrz.pridej(500);
            nadrz.odeber(228);
        }catch (PlnaNadrzException e){
            e.getMessage();
        }
        catch (PrazdnaNadrzException e1){
            e1.getMessage();
        }
        System.out.println(nadrz.getKapacita()+"\n"+nadrz.getStav());

    }
    public  void cv4(){
        System.out.println(new KvadratickaRovnice1(2,3,4)); ;
        new KvadratickaRovnice2(2);
        new KvadratickaRovnice3();
    }
    public  void cv9(){
        fib.Init();
        System.out.println(fib.calcRec(12));
        System.out.println(fib.calcRecTable(1));
        System.out.println(fib.calcNonRec(9));
    }
    public void cv6(){
        CodeCleaner c = new CodeCleaner();
        c.clean("Trojuhelnik.java","Trojuhelnik - final.java");
    }
    public void cv7(){
        String file = "src/main/resources/text.txt";
        Vypocet_Histogram v = new Vypocet_Histogram();
        v.hist("COCK");
        try {
            v.hist2(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
