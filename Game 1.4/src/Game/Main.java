package Game;

public class Main {
    public static void main(String[] args) {
        // Generowanie dwóch losowych wojowników
        Necromancer necromancer1 = Necromancer.generateRandomNecromancer();
        Necromancer necromancer2 = Necromancer.generateRandomNecromancer();
        Warrior warrior1 = Warrior.generateRandomWarrior();
        Warrior warrior2 = Warrior.generateRandomWarrior();
        Wizard wizard1 = Wizard.generateRandomWizard();
        Wizard wizard2 = Wizard.generateRandomWizard();

        // Wyświetlanie początkowych danych o wojownikach
        System.out.println(necromancer1);
        System.out.println(necromancer2);
        System.out.println(wizard1);
        System.out.println(wizard2);
        System.out.println(warrior1);
        System.out.println(warrior2);

        // Pojedynki
        System.out.println("\nNecromancer vs Warrior:");
        necromancer1.duel(warrior1);

        System.out.println("\nNecromancer vs Wizard:");
        necromancer2.duel(wizard1);

        System.out.println("\nWizard vs Warrior:");
        wizard2.duel(warrior2);



    }
}
