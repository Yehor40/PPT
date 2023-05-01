package org.example;

import cv1_2.BankovniUcet;
import cv1_2.CalcFaktorial;
import cv1_2.Exceptions.NedostatekProstredkuException;
import cv1_2.Exceptions.PlnaNadrzException;
import cv1_2.Exceptions.PrazdnaNadrzException;
import cv1_2.Exceptions.PrekrocenLimitException;
import cv1_2.Nadrz;

public class Main {
  static final  CalcFaktorial calcf1 = new CalcFaktorial();
  static final  CalcFaktorial calcf2 = new CalcFaktorial();
  static final BankovniUcet ucet = new BankovniUcet(1000,200);
  static final Nadrz nadrz = new Nadrz(1000,100);
    public static void main(String[] args) {
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


   public static class ToolCisla {
        public static int compare_int(int a, int b) {
            if (a<b) return -1;
            if (b<a) return +1;
            else
                return 0;
        }
    }
}