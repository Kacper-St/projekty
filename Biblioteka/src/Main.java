import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka(10);

        biblioteka.dodaj(new Czasopismo("motomoto", "janek", 2003, Tag.CZASOPISMO, 12));
        biblioteka.dodaj(new Ksiazka("ksiega jungli", "pawel", 2023, Tag.KSIAZKA, 1));
        biblioteka.dodaj(new Ksiazka("marvel", "janek", 2020, Tag.KOMIKS, 1));



        Scanner scanner = new Scanner(System.in);
        biblioteka.wyswietlWszystko();
        System.out.println("wyszukaj publikacje: ");
        String wyszukiwanie = scanner.next();
        biblioteka.wyszukajPublikacje(wyszukiwanie);


    }
}