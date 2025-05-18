package Game;

import java.util.Random;

public abstract class Hero {
    protected static String[] names = {"Tomek", "Stefan", "Maria", "Alex", "Olga", "Janusz", "Ralf", "Kevin", "Anna", "Marta", "Iwona"};  // Tablica możliwych imion
    protected String name;  // Imię bohatera
    protected int health;  // Zdrowie bohatera
    protected int strength;  // Siła bohatera

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    // Konstruktor przyjmujący imię, zdrowie i siłę
    public Hero(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    // Metoda sprawdzająca, czy bohater żyje
    public boolean isAlive() {
        return this.health > 0;
    }

    // Metoda ataku bohatera na innego bohatera
    public void attack(Hero other) {
        // Losowy bonus do ataku (np. od 0 do 10)
        Random random = new Random();
        int damage = this.strength + random.nextInt(11);  // Atak = siła + losowy bonus
        other.health -= damage;  // Zmniejszenie zdrowia przeciwnika

        // Wydrukuj informację o ataku
        System.out.printf("%s %s attacks %s %s\n", this.getClass().getSimpleName(), this.name, other.getClass().getSimpleName(), other.name);
    }

    // Abstrakcyjna metoda pojedynku
    public abstract Hero duel(Hero other);

    // Opcjonalnie, nadpisanie metody toString, aby lepiej wyświetlać bohatera
    @Override
    public String toString() {
        return String.format("%s[name=%s, health=%d, strength=%d]", getClass().getSimpleName(), name, health, strength);
    }


}



