import java.util.Scanner;

public class Biblioteka {

    private Publikacje[] publikacjetablica;
    private int maxPublikacji;
    private int aktualnaIloscPublikacji;

    public Biblioteka(int maxPublikacji) {
        this.maxPublikacji = maxPublikacji;
        publikacjetablica = new Publikacje[maxPublikacji];
        aktualnaIloscPublikacji = 0;
    }

    public void dodaj(Publikacje publikacje) {
        if (aktualnaIloscPublikacji < maxPublikacji) {
            publikacjetablica[aktualnaIloscPublikacji++] = publikacje;
        }
        else {
            System.out.println("nie ma miejsca");
        }
    }

    public void wyswietlWszystko(){
        for (int i = 0; i < aktualnaIloscPublikacji; i++) {
            publikacjetablica[i].wypiszInformacje();
        }
    }

    public void wyszukajPublikacje(String wyszukiwanie){
        for (int i = 0; i < aktualnaIloscPublikacji; i++) {
            if (publikacjetablica[i].getAutor().contains(wyszukiwanie) || publikacjetablica[i].getTytul().contains(wyszukiwanie)){
                publikacjetablica[i].wypiszInformacje();
            }
        }
    }




}
