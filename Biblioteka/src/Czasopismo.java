public class Czasopismo extends Publikacje{

    private int numerWydania;

    public Czasopismo(String tytul, String autor, int rokWydania, Tag tag, int numerWydania) {
        super(tytul, autor, rokWydania, tag);
        this.numerWydania = numerWydania;
    }

    @Override
    public void wypiszInformacje() {
        System.out.println("Tytul: " + getTytul());
        System.out.println("Autor: " + getAutor());
        System.out.println("Rok wydania: " + getRokWydania());
        System.out.println("Tag: " + getTag());
        System.out.println("Numer wydania: " + numerWydania + "\n");
    }
}
