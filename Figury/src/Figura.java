public abstract class Figura {

    private String nazwa;
    private String kolor;
    private String material;

    public Figura(String nazwa, String kolor, String material) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.material = material;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    abstract void wyswietlInformacje();
    abstract double obliczPrzekatna();
}
