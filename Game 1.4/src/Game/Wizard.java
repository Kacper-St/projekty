package Game;
import java.util.Random;

public class Wizard extends Hero implements Magic {
    protected int mana; // Siła magiczna
    private EMagic spell; // Zaklęcie magiczne

    // Konstruktor
    public Wizard(String name, int health, int strength, int mana, EMagic spell) {
        super(name, health, strength);
        this.mana = mana;
        this.spell = spell;
    }

    public int getMana() {
        return mana;
    }

    // Generowanie losowego Wizarda
    public static Wizard generateRandomWizard() {
        Random random = new Random();
        String name = names[random.nextInt(names.length)]; // Losowe imię
        int health = random.nextInt(51) + 200;  // Zdrowie: 50-250
        int strength = random.nextInt(11) + 10; // Siła: 10-20
        int mana = random.nextInt(41) + 60; // Mana: 60-100
        EMagic spell = EMagic.values()[random.nextInt(EMagic.values().length)]; // Losowy typ magii

        return new Wizard(name, health, strength, mana, spell);
    }

    // Atak fizyczny lub magiczny
    @Override
    public void attack(Hero other) {
        if (!(other instanceof Magic) && (mana >= spell.getManaCost())) {
            // Jeśli przeciwnik nie jest magiczny i mana jeszcze jest, atak magiczny
            this.magicAttack(other);
        } else {
            // Jeśli przeciwnik jest magiczny, atak fizyczny
            System.out.printf("Wizard %s attacks %s %s.\n", this.name, other.getClass().getSimpleName(), other.name);
            other.health -= this.strength; // Używamy siły
        }
    }

    // Atak magiczny
    @Override
    public void magicAttack(Hero other) {
        // Przeciwnik otrzymuje obrażenia zależne od mana i losowości
        Random random = new Random();
        int damage = spell.getDamage(); // Obliczenie obrażeń
        mana -= spell.getManaCost(); // Zużycie many
        other.health -= spell.getDamage();
        System.out.printf("Wizard %s attacks with spell %s %s %s causing %d damage.\n", this.name, spell.getType(), other.getClass().getSimpleName(), other.name, damage);
    }



    // Pojedynek
    @Override
    public Hero duel(Hero other) {
        System.out.printf("\nDuel between Wizard %s and %s %s begins!\n", this.name, other.getClass().getSimpleName(), other.name);
        while (this.isAlive() && other.isAlive()) {
            this.attack(other); // Wizard atakuje
            if (other.isAlive()) {
                other.attack(this); // Przeciwnik atakuje
            }
        }
        Hero winner = this.isAlive() ? this : other;
        System.out.printf("The winner is %s %s.\n", winner.getClass().getSimpleName(), winner.name);
        return winner;
    }

    @Override
    public String toString() {
        return String.format("Wizard[name=%s, health=%d, strength=%d, mana=%d]", name, health, strength, mana);
    }
}
