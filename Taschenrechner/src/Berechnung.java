import java.util.Scanner;
import java.io.*;

public class Berechnung {

    public static void main(String[] args)throws IOException {

        int beenden = 0;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Bitte waehlen Sie aus \n1) Addition,\n2) Subtraktion\n3) Multiplikation \n4) beenden");

        int wahl = in.nextInt();

        switch (wahl){


            case 1:
                System.out.println("Bitte a eingeben: ");
                int a = in.nextInt();                      //nextInt weil a hat Datentyp int

                System.out.println("Bitte b eingeben: ");
                int b = in.nextInt();

                int x = a+b;

                System.out.println("Das Ergebnis ist " + x);
                break;

            case 2:
                System.out.println("Bitte a eingeben: ");
                int c = in.nextInt();                      //nextInt weil a hat Datentyp int

                System.out.println("Bitte b eingeben: ");
                int d = in.nextInt();

                int h = c-d;

                System.out.println("Das Ergebnis ist "+h);
                break;

            case 3:
                System.out.println("Bitte a eingeben: ");
                int e = in.nextInt();                      //nextInt weil a hat Datentyp int

                System.out.println("Bitte b eingeben: ");
                int f = in.nextInt();

                int y = e*f;

                System.out.println("Das Ergebnis ist " + y);
                break;

            case 4:
                beenden = 1;
                break;

            default:
                System.out.println("Falsche Eingabe");
        }
        }while (beenden !=1);
    }
}
