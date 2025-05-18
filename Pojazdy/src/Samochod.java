public class Samochod extends Pojazd implements Ekologiczny, Bagaz{

    private int liczbaMiejsc;
    private boolean czyElektryczny;

    public Samochod(String producent, int rokProdukcji, int liczbaMiejsc, boolean czyElektryczny) {
        super("Samochod", producent, rokProdukcji);
        this.liczbaMiejsc = liczbaMiejsc;
        this.czyElektryczny = czyElektryczny;
    }

    @Override
    void wypiszInformacje() {
        System.out.println(getNazwa());
        System.out.println("Marka: " + getProducent());
        System.out.println("Rok produkcji: " + getRokProdukcji());
        System.out.println("Liczba miejsc: " + liczbaMiejsc);
        System.out.println("CzyElektryczny: " + czyElektryczny + "\n");
    }

    @Override
    public boolean czyEkologiczny() {
        return czyElektryczny;
    }

    @Override
    public boolean czyPosiadaBagaz() {
        return true;
    }
}
