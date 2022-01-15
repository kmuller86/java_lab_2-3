import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */


        //Pętla for z instrukcją break
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
                if (i >= 3) {
                    break;
                }
                System.out.println("Nadal dzialam.");
            }

        //pętla for z instrukcją continue, pokaz liczby nieparzyste z zakresu 1-10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue ;
            }
            System.out.println(i);
        }


        /* przykła użycia return */

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swój wiek:");
        int wiek = sc.nextInt();

        for (int i = 0; i <= 100; i++) {
            if (i == wiek)
                return;
            System.out.print(i + " ");
        }

    }
}



