import java.util.Scanner;

public class Stol {
    private Talia talia;
    private Reka rekaGracza;
    private Reka rekaKrupiera;
    Scanner skaner = new Scanner(System.in);


    public void partia() {
        int saldoPoczatkowe = 100;
        int kasa = saldoPoczatkowe;
        int portfelKrupiera = 0;
        boolean wlacznik = true;

        while (wlacznik) {
            int wybor;

            int stawka = 0;


            if (kasa == 0) {
                System.out.println("Haha, chcesz zagrac jeszcze raz? 1 - tak, 2 - nie");
                wybor = skaner.nextInt();
                if (wybor == 1) {
                    kasa = saldoPoczatkowe;
                }
                if (wybor == 2) {
                    System.out.println("Dzieki za kase");
                    break;
                }
                if (wybor > 2) {
                    System.out.println("Nie umiesz wybrac dobrze wiec dajesz napiwek 10% dla krupiera, Zostalo ci: " + kasa + "ziko.");
                    kasa -= saldoPoczatkowe / 10;
                    portfelKrupiera += saldoPoczatkowe / 10;
                    continue;
                }
            }

            System.out.print("Moze partyjke? 1 - tak, 2 - nie: ");
            wybor = skaner.nextInt();
            if (wybor > 2) {
                kasa -= saldoPoczatkowe / 10;
                portfelKrupiera += saldoPoczatkowe / 10;
                System.out.println("Nie umiesz wybrac dobrze wiec dajesz napiwek 10% dla krupiera. Zostalo ci: " + kasa + "ziko");
                continue;
            }


            if (wybor == 1) {
                System.out.print("za ile wchodzisz? twoj budzet to: " + kasa + " : ");
                stawka = skaner.nextInt();
                if (stawka > kasa) {
                    stawka = kasa;
                    System.out.println("Nie masz tyle ale wchodzisz allin za: " + kasa);

                }
                System.out.println("Grasz za: " + stawka);
                talia = new Talia();
                rekaGracza = new Reka();
                rekaKrupiera = new Reka();
                talia.tasuj();
                rekaGracza.dodajKarty(talia.dobierzKarte());
                rekaGracza.dodajKarty(talia.dobierzKarte());
                rekaKrupiera.dodajKarty(talia.dobierzKarte());
                rekaGracza.pokazReke();
                System.out.println("Aktualnie masz: " + rekaGracza.getWartoscReki() + " punktow");
                rekaKrupiera.pokazRekeKrupiera();
                wybor = 0;
            }
            if (wybor == 2) {
                if (kasa > saldoPoczatkowe) {
                    System.out.println("Wychodzisz z kwota: " + kasa + ". Jestes: " + (kasa - saldoPoczatkowe) + " na plus");
                }
                else if (kasa < saldoPoczatkowe) {
                    System.out.println("Wychodzisz z kwota: " + kasa + ". Jestes: " + (kasa - saldoPoczatkowe) + " na minus");
                }
                wlacznik = false;
                break;
            }


            if (rekaGracza.getWartoscReki() == 21) {
                System.out.println("Blackjack!");
                kasa += stawka * 2;
                continue;
            }
            boolean partiaTrwa = true;
            while (partiaTrwa) {

                System.out.println("1 - Dobierz Karte, 2 - Stoj, 3 - Podwoj, 4 - Daj napiwek dla krupiera");
                wybor = skaner.nextInt();
                if (wybor == 1) {
                    rekaGracza.dodajKarty(talia.dobierzKarte());
                    rekaGracza.pokazReke();
                    System.out.println("Aktualnie masz: " + rekaGracza.getWartoscReki());
                    if (rekaGracza.getWartoscReki() > 21) {
                        System.out.println("Przegrales");
                        kasa -= stawka;
                        partiaTrwa = false;
                    }
                }
                if (wybor == 2) {
                    rekaKrupiera.dodajKarty(talia.dobierzKarte());
                    while (rekaKrupiera.getWartoscReki() < 17) {
                        rekaKrupiera.dodajKarty(talia.dobierzKarte());

                    }
                    rekaKrupiera.pokazRekeKrupiera();
                    if (rekaKrupiera.getWartoscReki() > 21) {
                        System.out.println("Krupier przeholowal. Wygrales");
                        kasa += stawka;
                        partiaTrwa = false;
                    }
                    else if (rekaGracza.getWartoscReki() > rekaKrupiera.getWartoscReki()) {
                        System.out.println("Gracz: " + rekaGracza.getWartoscReki() + " Krupier: " + rekaKrupiera.getWartoscReki());
                        System.out.println("Wygrales");
                        kasa += stawka;
                        partiaTrwa = false;
                    }

                    else if (rekaGracza.getWartoscReki() < rekaKrupiera.getWartoscReki() && rekaKrupiera.getWartoscReki() <= 21) {
                        System.out.println("Gracz: " + rekaGracza.getWartoscReki() + " Krupier: " + rekaKrupiera.getWartoscReki());
                        System.out.println("Przegrales");
                        kasa -= stawka;
                        partiaTrwa = false;
                    }
                    else if (rekaGracza.getWartoscReki() == rekaKrupiera.getWartoscReki()) {
                        System.out.println("Remis");
                        partiaTrwa = false;

                    }
                }
                    if (wybor == 3) {
                        if (stawka * 2 > kasa) {
                            System.out.println("Nie mozesz podwoic");
                            continue;
                        }
                        stawka = stawka * 2;
                        System.out.println("Podwajasz stawke, aktualnie grasz za: " + stawka);
                        rekaKrupiera.dodajKarty(talia.dobierzKarte());
                        while (rekaKrupiera.getWartoscReki() < 17) {
                            rekaKrupiera.dodajKarty(talia.dobierzKarte());

                        }
                        rekaKrupiera.pokazRekeKrupiera();
                        if (rekaKrupiera.getWartoscReki() > 21) {
                            System.out.println("Krupier przeholowal. Wygrales");
                            kasa += stawka;
                            partiaTrwa = false;
                        } else if (rekaGracza.getWartoscReki() > rekaKrupiera.getWartoscReki()) {
                            System.out.println("Gracz: " + rekaGracza.getWartoscReki() + " Krupier: " + rekaKrupiera.getWartoscReki());
                            System.out.println("Wygrales");
                            kasa += stawka;
                            partiaTrwa = false;
                        } else if (rekaGracza.getWartoscReki() < rekaKrupiera.getWartoscReki() && rekaKrupiera.getWartoscReki() <= 21) {
                            System.out.println("Gracz: " + rekaGracza.getWartoscReki() + " Krupier: " + rekaKrupiera.getWartoscReki());
                            System.out.println("Przegrales");
                            kasa -= stawka;
                            partiaTrwa = false;
                        } else if (rekaGracza.getWartoscReki() == rekaKrupiera.getWartoscReki()) {
                            System.out.println("Remis");
                            partiaTrwa = false;

                        }
                    }
                    if (wybor == 4) {
                        System.out.println("Ile chcesz dac napiwku?");
                        stawka = skaner.nextInt();
                        if (stawka >= kasa) {
                            System.out.println("Hojny jestes ale sie splukasz");
                        } else {
                            kasa -= stawka;
                            portfelKrupiera += stawka;
                            System.out.println("Dales krupierowi: " + stawka + ". To lacznie juz: " + portfelKrupiera);
                        }
                    }

                    if (wybor > 4) {
                        System.out.println("Nie umiesz wybrac dobrze wiec dajesz napiwek 10% dla krupiera, Zostalo ci: " + kasa + " ziko.");
                        kasa -= saldoPoczatkowe / 10;
                        portfelKrupiera += saldoPoczatkowe / 10;
                        continue;
                    }

                }
            }

        }
    }



