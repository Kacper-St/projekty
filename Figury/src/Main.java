import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FiguraManager manager = new FiguraManager();
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("1 Dodaj Trojkat ");
            System.out.println("2 Dodaj Kolo ");
            System.out.println("3 Wyswietl figury ");
            System.out.println("4 Minimalne pole figury: ");
            System.out.println("5 Minimalny obwod: ");
            System.out.println("6 Wyjdz: ");
            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj kolor: ");
                    String kolorTrojkat = scanner.next();
                    System.out.print("Podaj material: ");
                    String materialTrojkat = scanner.next();
                    System.out.print("Podaj podstawe: ");
                    double podstawe = scanner.nextDouble();
                    System.out.print("Podaj wysokosc: ");
                    double wysokosc = scanner.nextDouble();
                    System.out.print("Podaj BokA: ");
                    double bokA = scanner.nextDouble();
                    System.out.print("Podaj BokB: ");
                    double bokB = scanner.nextDouble();
                    manager.dodajFigure(new Trojkat(kolorTrojkat, materialTrojkat, podstawe, wysokosc, bokA, bokB));
                    break;
                case 2:
                    System.out.print("Podaj kolor: ");
                    String kolorKolo = scanner.next();
                    System.out.print("Podaj material: ");
                    String materialKolo = scanner.next();
                    System.out.print("Podaj promien: ");
                    double promien = scanner.nextDouble();
                    manager.dodajFigure(new Kolo(kolorKolo, materialKolo, promien, 2* promien));
                    break;
                case 3:
                    manager.wyswietlWszystkieFigury();
                    break;
                case 4:
                    System.out.print("Podaj minimalne pole figury: ");
                    double poleFigury = scanner.nextDouble();
                    manager.wyswietlFiguryZPolem(poleFigury);
                    break;
                case 5:
                    System.out.print("Podaj minimalne obwod: ");
                    double obwod = scanner.nextDouble();
                    manager.wyswietlFiguryZObwodem(obwod);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Niepoprawna liczba");
                    break;
            }
        }

    scanner.close();

    }
}