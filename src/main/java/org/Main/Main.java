package org.Main;

import java.util.Scanner;

public class Main {
  final static Menu menu = new Menu();
    public static void main(String[] args) {

        String s ="";
        while(true){
            System.out.println("Pro spusteni nejakeho ukole zvolte cislo od 1 do 9 | Pro zastaveni zmacknete 'q'nebo'Q'"+"\n"+"Zadejte cislo:");
            Scanner sc = new Scanner(System.in);
            s =sc.nextLine();
        switch (s){
        case "1":
           menu.cv1();
        break;
                case "2":
                    menu.cv2();
                    break;
            case "3":
                menu.cv3_part1();
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                menu.cv3_part2();
                break;
            case "4":
                menu.cv4();
                break;
            case "5":
                menu.cv5();
                break;
            case "6":
               menu.cv6();
                break;
            case "7":
               menu.cv7();
                break;
            case "8":
                System.out.println("zatim nenaimplementovano");
                break;
            case "9":
                menu.cv9();
                break;
            case"Q":System.exit(0);
            break;
            case"q":System.exit(0);
                break;
            default:
                System.out.println("takovy ukol neexistuje!");
        }
        }
    }
}