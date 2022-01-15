import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        int indeks = 4;
        for(int i = 100; i >= 0; i--){
            if (i % indeks == 0 && i != 0)
                System.out.println(i + " jest podzielna przez " + indeks);
        }
        // System.out.println("\n");





        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        Scanner sc = new Scanner(System.in);

        System.out.println("\n");
        int[] tab = new int[5];

        for (int j = 0; j < tab.length; j++) {
            {
                System.out.println("Podaj liczbę:");
                int tmp = sc.nextInt();
                tab[j] = tmp;
            }
        }

        for (int x : tab) {
            System.out.println(x + 11);
        }
    }
}
