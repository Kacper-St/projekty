public class Kolo extends Figura implements Obwod{

    private double promien;
    private double srednica;

    public Kolo(String kolor, String material, double promien, double srednica) {
        super("Kolo", kolor, material);
        this.promien = promien;
        this.srednica = srednica;
    }

    @Override
    void wyswietlInformacje() {
        System.out.println("Nazwa: " + getNazwa());
        System.out.println("Kolor: " + getKolor());
        System.out.println("Material: " + getMaterial());
        System.out.println("Promien: " + promien);
        System.out.println("Srednica: " + (2 *  promien + "\n"));
    }

    @Override
    double obliczPrzekatna() {
        return promien * 2;
    }

    @Override
    public double obliczObwod() {
        return 2 * 3.14 * promien;
    }
}
