import java.util.List;
import java.util.ArrayList;

public class Garaz {

    private Pojazd[] pojazdy;
    private int maxPojazdow;
    private int aktaualniePojazdow;

    public Garaz(int maxPojazdow){
        this.maxPojazdow = maxPojazdow;
        pojazdy = new Pojazd[maxPojazdow];
        aktaualniePojazdow = 0;
    }

    public void dodajPojazd(Pojazd pojazd){
        if (aktaualniePojazdow < maxPojazdow){
            pojazdy[aktaualniePojazdow++] = pojazd;
        }
        else{
            System.out.println("nie ma miejsc w garazu!");
        }
    }

    public void wyswietlWszystkiePojazdy(){
        for (int i = 0; i < aktaualniePojazdow; i++){
            pojazdy[i].wypiszInformacje();
        }
    }

    public void wyswietlEkologicznePojazdy(){
        for (int i = 0; i < aktaualniePojazdow; i++){
            if (pojazdy[i] instanceof Ekologiczny){
                if (((Ekologiczny)pojazdy[i]).czyEkologiczny()){
                    pojazdy[i].wypiszInformacje();
                }
            }
        }
    }

    public void wyswietlPojazdyZBagaznikiem(){
        for (int i = 0; i < aktaualniePojazdow; i++){
            if (pojazdy[i] instanceof Bagaz){
                Bagaz bagaz = (Bagaz) pojazdy[i];
                if (bagaz.czyPosiadaBagaz()){
                    pojazdy[i].wypiszInformacje();
                }
            }
        }
    }



}