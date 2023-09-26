package Task_1;

public class TowersOfHanoi {
    public static void moveTower(int disk, int source, int dest, int spare) {
        if (disk == 0) {
            return;
        } else {
            moveTower(disk - 1, source, spare, dest);
            System.out.println("Move disk from source " + source + " to destination " + dest);
            moveTower(disk - 1, spare, dest, source);
        }
    }

    public static void main(String[] args) {
        moveTower(6, 1, 3, 2);
    }
}