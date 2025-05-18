package FightArmy;

public class TestArmies {
    public static void main(String[] args) {
        Army army1 = Army.generateRandomArmy(3, "Army A");
        Army army2 = Army.generateRandomArmy(3, "Army B");

        System.out.println("Before Battle:");
        System.out.println(army1);
        System.out.println(army2);

        Army winner = army1.battle(army2);

        System.out.println("\nWinner is: " + winner.getName());
    }
}
