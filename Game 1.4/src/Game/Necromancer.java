package Game;
import java.util.Random;

public class Necromancer extends Wizard {
    private Skeleton skeleton; // Szkielet związany z Nekromantą

    public Necromancer(String name, int health, int strength, int mana, EMagic spell) {
        super(name, health, strength, mana, spell);
        createSkeleton(); // Tworzenie początkowego szkielety
    }

    public static Necromancer generateRandomNecromancer() {
        Random random = new Random();
        String name = names[random.nextInt(names.length)]; // Losowe imię
        int health = random.nextInt(31) + 50;  // Zdrowie: 50-80
        int strength = random.nextInt(11) + 10; // Siła: 10-20
        int mana = random.nextInt(41) + 60; // Mana: 60-100
        EMagic spell = EMagic.values()[random.nextInt(EMagic.values().length)]; // Losowy typ magii
        return new Necromancer(name, health, strength, mana,spell);
    }

    // Tworzenie szkielety
    private void createSkeleton() {
        int skeletonHealth = (int) (this.health * 0.4); // 40% zdrowia Necromanty
        int skeletonStrength = this.strength * 2;      // 2x siła Necromanty
        this.skeleton = new Skeleton(skeletonHealth, skeletonStrength);

    }

    @Override
    public void attack(Hero other) {
        if (other instanceof Magic) {
            // Atak szkielety
            System.out.printf("Necromancer %s attacks with skeleton %s %s.\n", this.name, other.getClass().getSimpleName(), other.getName());
            other.health -= this.skeleton.getStrength();
        } else {
            // Atak magiczny
            this.magicAttack(other);
        }
    }

    @Override
    public Hero duel(Hero other) {
        System.out.printf("\nDuel begins: Necromancer %s vs %s %s\n", this.name, other.getClass().getSimpleName(), other.getName());
        while (this.isAlive() && other.isAlive()) {
            this.attack(other); // Necromancer atakuje
            if (other.isAlive()) {
                other.attack(this); // Przeciwnik atakuje
            }
        }
        Hero winner = this.isAlive() ? this : other;
        System.out.printf("The winner is %s %s.\n", winner.getClass().getSimpleName(), winner.getName());
        return winner;
    }

    // Klasa wewnętrzna Skeleton
    private class Skeleton {
        private int health;
        private int strength;

        public Skeleton(int health, int strength) {
            this.health = health;
            this.strength = strength;
        }

        public int getHealth() {
            return health;
        }

        public int getStrength() {
            return strength;
        }

        public boolean isAlive() {
            return health > 0;
        }
    }


    @Override
    public String toString() {
        return String.format("Necromancer[name=%s, health=%d, strength=%d, mana=%d] and his Skeleton [health=%d, strength=%d]", name, health, strength, mana, skeleton.getHealth(), skeleton.getStrength());
    }
}

