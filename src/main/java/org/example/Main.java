package org.example;

import cv1_2.CalcFaktorial;

public class Main {
    public static void main(String[] args) {
        CalcFaktorial calcf1 = new CalcFaktorial();
        CalcFaktorial calcf2 = new CalcFaktorial();
        calcf1.calc1(6);
        calcf2.calc2(6);
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