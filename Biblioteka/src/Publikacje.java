public abstract class Publikacje {

    private String tytul;
    private String autor;
    private int rokWydania;
    private Tag tag;

    public Publikacje(String tytul, String autor, int rokWydania, Tag tag) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.tag = tag;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public abstract void wypiszInformacje();

}
