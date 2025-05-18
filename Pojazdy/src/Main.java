import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Garaz garaz = new Garaz(10);

        boolean run = true;
        while (run) {
            System.out.println("1: Dodaj samochod: ");
            System.out.println("2: Dodaj motocykl: ");
            System.out.println("3: Wyswietl wszystkie pojazdy: ");
            System.out.println("4: Wyswietl wszystkie pojazdy ekologiczne: ");
            System.out.println("5: Wyswietl wszystkie pojazdy z bagazem: ");
            System.out.println("6: Wyjdz: ");

            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj marke samochodu: ");
                    String marka = scanner.next();
                    System.out.print("Podaj rok produkcji: ");
                    int rokProdukcji = scanner.nextInt();
                    System.out.print("Podaj liczbe miejsc: ");
                    int liczbaMiejsc = scanner.nextInt();
                    System.out.print("Czy jest elektryczny(true/false): ");
                    boolean elektryczny = scanner.nextBoolean();
                    garaz.dodajPojazd(new Samochod(marka, rokProdukcji, liczbaMiejsc, elektryczny));
                    break;
                case 2:
                    System.out.print("Podaj marke motocykla: ");
                    String markaMoto = scanner.next();
                    System.out.print("Podaj rok produkcji: ");
                    int rokProdukcjiMoto = scanner.nextInt();
                    System.out.print("Czy ma kufry(true/false): ");
                    boolean kufryMoto = scanner.nextBoolean();
                    garaz.dodajPojazd(new Motocykl(markaMoto, rokProdukcjiMoto, kufryMoto));
                    break;
                case 3:
                    garaz.wyswietlWszystkiePojazdy();
                    break;
                case 4:
                    garaz.wyswietlEkologicznePojazdy();
                    break;
                case 5:
                    garaz.wyswietlPojazdyZBagaznikiem();
                    break;
                case 13022003:
                    garaz.dodajPojazd(new Samochod("Dodge Challenger", 2023, 4, false));
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Zla liczba!!!");
                    break;
            }
        }
    scanner.close();
    }
}
