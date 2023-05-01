package cv9;

import java.math.BigInteger;


public class CalcFibonacci {
    
    public int calcNonRec(int n) {
        if (n == 0) {
            return 0;
        }
        
        if (n == 1){
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }

    public  int calcRec(int n) {
        if(n ==0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        } else {
            return (calcRec(n-1) + (calcRec(n-2)));
        }
    }
     
    
    static BigInteger[] array = new BigInteger[5];
       
    public  void Init() {

        array[0] = new BigInteger("0");
        array[1] = new BigInteger("1");
        
        for(int i = 2; i < array.length; i++) {
            //array[i] = new BigInteger("0");
            array[i] = array[i - 2].add(array[i - 1]);
            //array[i] = array[i].add(array[i - 2]);
            System.out.println("index: " + i + " velikost: " + (array[i].bitLength())/8);
        }
    }
		
    // definice tabulky
    public  String calcRecTable(int n) {
        if(n > array.length - 1) {
            return "Chyba! Zadaná hodnota je mimo rozsah pole!";
        }
        return array[n].toString();    
    }

}
