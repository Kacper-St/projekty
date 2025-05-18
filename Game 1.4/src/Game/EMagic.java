package Game;
import java.util.Random;

public enum EMagic {
    FIREBALL(25, "FireBall", 25),
    FROSTBALL(20, "FrostBall", 20),
    AIRBALL(25, "AirBall", 25);

    private final int Damage; // Bazowe obrażenia
    private final String type;    // Typ zaklęcia (np. Fire, Frost, Air)
    private final int manaCost;   // Koszt many

    // Konstruktor dla każdego zaklęcia
    EMagic(int baseDamage, String type, int manaCost) {
        this.Damage = baseDamage;
        this.type = type;
        this.manaCost = manaCost;
    }

    // Getter dla obrażeń z losowością +/- 10%
    public int getDamage() {
        Random random = new Random();
        double variance = 0.1 * Damage;
        return Damage + (int) (random.nextDouble() * 2 * variance - variance);
    }

    // Getter dla typu zaklęcia
    public String getType() {
        return type;
    }

    // Getter dla kosztu many
    public int getManaCost() {
        return manaCost;
    }
}

