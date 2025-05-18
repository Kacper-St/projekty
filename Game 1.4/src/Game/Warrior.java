package Game;
import java.util.Random;

public class Warrior extends Hero {

    // Konstruktor klasy Warrior
    public Warrior(String name, int health, int strength) {
        super(name, health, strength);
    }

    // Metoda statyczna generująca losowego wojownika
    public static Warrior generateRandomWarrior() {
        Random random = new Random();
        String name = names[random.nextInt(names.length)];  // Losowe imię
        int health = random.nextInt(50) + 50;  // Zdrowie z przedziału 50-100
        int strength = random.nextInt(21) + 20;  // Siła z przedziału 20-40

        return new Warrior(name, health, strength);
    }

    // Metoda duel, która prowadzi pojedynek z innym bohaterem
    @Override
    public Hero duel(Hero other) {
        System.out.printf("\nDuel between %s %s and %s %s begins!\n", this.getClass().getSimpleName(), this.name, other.getClass().getSimpleName(), other.name);

        // Dopóki oba są żywe, atakują się wzajemnie
        while (this.isAlive() && other.isAlive()) {
            this.attack(other);  // Wojownik atakuje przeciwnika
            if (other.isAlive()) {
                other.attack(this);  // Przeciwnik atakuje wojownika, jeśli jeszcze żyje
            }
        }
        // Zwracamy zwycięzcę
        if (this.isAlive()) {
            System.out.println(this.name + " wins the duel!");
            return this;
        } else {
            System.out.println(other.name + " wins the duel!");
            return other;
        }
    }
}
