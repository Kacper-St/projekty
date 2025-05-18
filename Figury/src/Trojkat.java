public class Trojkat extends Figura implements Obwod, Pole{

    private double podstawa;
    private double wysokosc;
    private double bokA;
    private double bokB;

    public Trojkat(String kolor, String material, double podstawa, double wysokosc, double bokA, double bokB) {
        super("Trojkat", kolor, material);
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    void wyswietlInformacje() {
        System.out.println("Nazwa: " + getNazwa());
        System.out.println("Kolor: " + getKolor());
        System.out.println("Material: " + getMaterial());
        System.out.println("Podstawa: " + podstawa);
        System.out.println("Wysokosc: " + wysokosc);
        System.out.println("BokA: " + bokA);
        System.out.println("BokB: " + bokB + "\n");
    }

    private boolean czyJestRownoboczny(){
        return podstawa == bokA && bokB == bokA;
    }

    @Override
    double obliczPrzekatna() {
        return 0;
    }

    @Override
    public double obliczObwod() {
        return bokB + bokA + podstawa;
    }

    @Override
    public double obliczPole() {
        return podstawa * wysokosc / 2;
    }
}
