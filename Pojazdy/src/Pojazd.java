public abstract class Pojazd {

    private String nazwa;
    private String producent;
    private int rokProdukcji;

    public Pojazd(String nazwa, String producent, int rokProdukcji) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    abstract void wypiszInformacje();
}
