
package treasurehuntgame;


public class TreasureHuntGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Treasure Hunt!");
        startGame();
    }

    public static void startGame() {
        int[] treasures = {100, 200, 300, 400, 500};
        findTreasure(treasures, 4); 
    }

    public static void findTreasure(int[] treasures, int index) {
        int treasureValue = treasures[index]; 
        System.out.println("You found treasure worth: " + treasureValue + " coins!");
        collectTreasure(treasureValue);
    }

    public static void collectTreasure(int value) {
        System.out.println("Collecting " + value + " coins...");
    }
}
