public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        //2 ostatnie cyfry to 24, zmienna k


        int index = 43074;
        int x = index % 100;
        int i = 1000;
        do {
            System.out.println(i);
            if (i % x == 0){
                System.out.println("Liczba " + i + " jest podzielna przez " + x);
            }
        } while (--i > 0);
        System.out.println("\n");


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while - uzyc 2 petle
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */


//        a)

        int [] tablica1 = new int [5];
        tablica1[0] = 87;
        tablica1[1] = 65;
        tablica1[2] = 91;
        tablica1[3] = 43;
        tablica1[4] = 28;
        int j = 0;
        while(j < 5){
            System.out.println("table [" + j +"] = " + tablica1[j]);
            ++j;
            if(j == 5){
                System.out.println("\n");
                break;
            }
        }

        //  b)
        double [] tablica2 = new double[5];
        tablica2[0] = 3.14;
        tablica2[1] = 4.12;
        tablica2[2] = 7.67;
        tablica2[3] = 8.916;
        tablica2[4] = 10;

        int k = 0;
        while(k < 5){
            System.out.println("table_double [" + k +"] = " + tablica2[k]);
            ++k;
            if(k == 5){
                System.out.println("\n");
                break;
            }
        }

        //c
        String [] table_String = new String[5];
        table_String[0] = "Maciej";
        table_String[1] = "Kamil";
        table_String[2] = "Karolina";
        table_String[3] = "Stefa";
        table_String[4] = "Pola";

        int s = 0;
        while(s < 5){
            System.out.println("table_String [" + s +"] = " + table_String[s]);
            ++s;
            if(s == 5){
                System.out.println("\n");
                break;
            }
        }



      /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


  /*      while (true) {
            System.out.println("Siemano");
        }*/

        //Pętla (true) uruchamia się w nieskończoność, false się wysypuje, zakomentowałem aby móc sprawdzic inne zadania

    }
}