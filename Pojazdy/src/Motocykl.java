public class Motocykl extends Pojazd implements Bagaz{

    private boolean czyMaKufry;

    public Motocykl(String producent, int rokProdukcji, boolean czyMaKufry) {
        super("Motocykl", producent, rokProdukcji);
        this.czyMaKufry = czyMaKufry;
    }

    @Override
    void wypiszInformacje() {
        System.out.println(getNazwa());
        System.out.println("Marka: " + getProducent());
        System.out.println("Rok produkcji: " + getRokProdukcji());
        System.out.println("Czy ma kufry: " + czyMaKufry + "\n");
    }

    @Override
    public boolean czyPosiadaBagaz() {
        return czyMaKufry;
    }

}
