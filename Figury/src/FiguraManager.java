import java.util.ArrayList;
import java.util.List;

public class FiguraManager {

    private List<Figura> figury = new ArrayList<Figura>();



    public void dodajFigure(Figura figura) {
        figury.add(figura);
    }

    public void wyswietlWszystkieFigury(){
        for(Figura figura : figury){
            figura.wyswietlInformacje();
        }
    }

    public void wyswietlFiguryZPolem(double minimalnePole){
        for(Figura figura : figury){
            if(figura instanceof Pole){
                Pole pole = (Pole) figura;
                if (pole.obliczPole() > minimalnePole){
                    figura.wyswietlInformacje();
                }
            }
        }
    }

    public void wyswietlFiguryZObwodem(double minimalnyObwod){
        for(Figura figura : figury){
            if(figura instanceof Obwod){
                Obwod obwod = (Obwod) figura;
                if(obwod.obliczObwod() > minimalnyObwod){
                    figura.wyswietlInformacje();
                }
            }
        }
    }
}






