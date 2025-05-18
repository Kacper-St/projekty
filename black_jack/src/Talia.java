import java.util.ArrayList;
import java.util.Collections;

public class Talia {
    private ArrayList<Karty> karty = new ArrayList<>();

    public Talia(){
        String[] kolory = {"Kier", "Karo", "Trefl", "Pik"};
        String[] rangi = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jopek", "Dama", "Krol", "As"};
        int[] wartosci = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for (String kolor: kolory){
            for(int i =  0; i<rangi.length; i++){
                karty.add(new Karty(kolor, rangi[i], wartosci[i]));
            }
        }
    }
    public void tasuj(){
        Collections.shuffle(karty);
    }
    public Karty dobierzKarte(){
        return karty.remove(0);
    }


}
