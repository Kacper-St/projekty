public class Karty {
    protected String kolor;
    protected String ranga;
    protected int wartosc;

    public Karty(String kolor, String ranga, int wartosc) {
        this.kolor = kolor;
        this.ranga = ranga;
        this.wartosc = wartosc;

    }
    public String getKolor() {
        return kolor;
    }
    public String getRanga() {
        return ranga;
    }
    public int getWartoscKarty() {
        return wartosc;
    }
    @Override
    public String toString(){
        return getRanga() + " " + getKolor();
    }
}
