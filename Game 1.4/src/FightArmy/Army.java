package FightArmy;
import Game.*;

import java.util.Random;

public class Army {
    private String name;
    private Hero[] myArmy;

    public Army(int size) {
        if (size > 0)
            this.myArmy = new Hero[size];
        else
            System.out.println("Army size must be greater than 0");
    }

    public static Army generateRandomArmy(int size, String name) {
        Random random = new Random();
        Hero[] heroes = new Hero[size];
        for (int i = 0; i < size; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    heroes[i] = Warrior.generateRandomWarrior();
                    break;
                case 1:
                    heroes[i] = Necromancer.generateRandomNecromancer();
                    break;
                case 2:
                    heroes[i] = Wizard.generateRandomWizard();
                    break;
            }
        }
        Army army = new Army(size);
        army.myArmy = heroes;
        army.name = name;
        return army;
    }


    public Army battle(Army enemies) {
        System.out.println("Battle between " + this.name + " and " + enemies.name);
        int thisArmyWins = 0;
        int enemiesArmyWins = 0;

        for (int i = 0; i < this.myArmy.length; i++) {
            Hero winner = this.myArmy[i].duel(enemies.myArmy[i]);
            if (winner == this.myArmy[i]) {
                thisArmyWins++;
            } else {
                enemiesArmyWins++;
            }
        }

        System.out.println(this.name + " wins: " + thisArmyWins + ", " + enemies.name + " wins: " + enemiesArmyWins);
        return thisArmyWins >= enemiesArmyWins ? this : enemies;
    }

    public String getName(){
        return this.name;
    }

    public Hero[] GetArmy(){
        return this.myArmy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Army Name: " + this.name + "\n");
        sb.append("Size: ").append(this.myArmy.length).append("\nMembers:\n");
        for (Hero hero : myArmy) {
            sb.append(hero).append("\n");
        }
        return sb.toString();
    }
}
