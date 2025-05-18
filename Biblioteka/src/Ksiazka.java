public class Ksiazka extends Publikacje{

    private int liczbaStron;

    public Ksiazka(String tytul, String autor, int rokWydania, Tag tag, int liczbaStron) {
        super(tytul, autor, rokWydania, tag);
        this.liczbaStron = liczbaStron;
    }

    @Override
    public void wypiszInformacje() {
        System.out.println("Tytul: " + getTytul());
        System.out.println("Autor: " + getAutor());
        System.out.println("Rok wydania: " + getRokWydania());
        System.out.println("Tag: " + getTag());
        System.out.println("LiczbaStron: " + liczbaStron + "\n");
    }
}
