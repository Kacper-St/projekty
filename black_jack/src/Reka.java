import java.util.ArrayList;

public class Reka {
    private ArrayList<Karty> karty = new ArrayList<>();


    public void dodajKarty(Karty karta) {
        karty.add(karta);
    }
    public int getWartoscReki(){
        int wartoscReki = 0;
        int wartoscAsa = 0;

        for (Karty karta : karty) {
            wartoscReki += karta.getWartoscKarty();
            if (karta.getRanga().equals("As")){
                wartoscAsa++;
            }
        }
        while (wartoscReki > 21 && wartoscAsa > 0){
            wartoscReki -= 10;
            wartoscAsa--;
        }
        return wartoscReki;
    }
    public void pokazReke(){
        System.out.println("Twoje karty: ");
        for (Karty karta : karty) {
            System.out.print(karta + ", ");
        }
    }
    public void pokazRekeKrupiera(){
        System.out.println("Karty Krupiera: ");
        for (Karty karta : karty) {
            System.out.print(karta + ", ");
            System.out.println("");
        }
    }

}
