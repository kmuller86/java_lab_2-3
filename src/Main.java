import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        System.out.println("Zadanie 1a ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 nazw zwierząt: ");

        List<String> lista1 = new ArrayList<>();
        for (int i = 0; i<5;i++ ) {
            lista1.add(scan.nextLine());
        }
        System.out.println(lista1);

        System.out.println("\n Zadanie 1b");
        for (String x : lista1) {
            System.out.println(x + ",");
        }

        System.out.println("\n Zadanie 1c");
        lista1.remove(4);
        lista1.remove(3);
        System.out.println(lista1);
        System.out.println("Proszę podać 3 inne zwięrzęta, które nie znajdywały się wcześniej w liście:");
        lista1.add(scan.nextLine());
        lista1.add(scan.nextLine());
        lista1.add(scan.nextLine());
        System.out.println(lista1);

        System.out.println("\n Zadanie1d");
        lista1.sort(Collections.reverseOrder());
        for (String x  :lista1
        ) {
            System.out.println(x + ",");
        }




         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        System.out.println("\n Zadanie 2");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("\n Proszę podać 10 liczb ( niech się powtarzaja): ");
        Set<Integer> liczba = new TreeSet<>();
        for (int j= 0; j<10 ; j++){
            liczba.add(scan1.nextInt());}

        List<Integer> sortedList = new ArrayList<>(liczba);
        Collections.sort(sortedList);
        System.out.println(sortedList);
        System.out.println(liczba);
        for (Integer y: liczba) {
            System.out.println(y + ",");
        }

    }

}