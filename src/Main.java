public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */


/*
        int i = 1000;
        int k = 24;
        System.out.println("\n");
        while ((--i) > 0) {
            if (i % 24 == 0) {
                System.out.print("\nliczba: " + i + " - podzielna przez 24");
            }
            if (i == 997) {
                System.out.print("\nliczba: " + i + "  - ten numer to kłopoty");
            }
        }
*/
        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while - uzyc 2 petle
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */


//        a)
/*        int[] tablica = new int[5];
        for (int i = 0; i < 5; i++)
            tablica[i] = i + 1;
        for (int i = 0; i < 5; i++)
            System.out.println(tablica[i]);
    }
}*/
        //  b)
/*        double[] tablica = new double[5];
        for (int d = 0; d < 5; d++) {
            tablica[d] = d + 1.13;
            System.out.println(tablica[d]);
        }*/



      /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


     /*   while (true)
        {
            System.out.println("Siemano");
        }*/

        //Pętla (true) uruchamia się w nieskończoność

    }
}