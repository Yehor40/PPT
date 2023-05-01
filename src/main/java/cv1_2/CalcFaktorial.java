package cv1_2;

import cv1_2.Exceptions.FaktorialException;

import static org.Main.Main.ToolCisla.compare_int;

public class CalcFaktorial {
    public  int calc1(int c) {
        int res = 1, i;

        if (compare_int(0,c)==-1) {
            System.out.print(c + "! = ");
            for (i = 1; i <= c; i++) {
                if(compare_int(i,c)==-1){
                    System.out.print(i + " x ");
                    res *=  i;
                }
                if(i == c){
                    System.out.print(i);
                    res *=  i;
                    System.out.println("\nThe factorial of " + c + " is " + res);
                    System.out.println();
                    return res;
                }
            }
        }else if (compare_int(0,c)==+1) {
            System.out.println("Chybné vstupní číslo");
            System.exit(0);
            return -1;
        }

        return 0;
    }

    public  int calc2(int c) throws FaktorialException {
        int res = 1, i;
        if (compare_int(0,c)==-1) {
            System.out.print(c + "! = ");
            for (i = 1; i <= c; i++) {
                if(compare_int(i,c)==-1){
                    System.out.print(i + " x ");
                    res *=  i;
                }
                if(i == c){
                    System.out.print(i);
                    res *=  i;
                    System.out.println("\nThe factorial of " + c + " is " + res);
                    System.out.println();
                    return res;
                }
            }
        }else if (compare_int(0,c)==+1) {
            throw new FaktorialException("Chybné vstupní číslo");
        }
        return 0;
    }
}
