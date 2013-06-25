import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> kermitHops = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (kermitHops.size() < 4) {
            kermitHops.add(scanner.nextInt());
        }

        final int JUMPS_IN_ROUND = 3;
        final int[] HOPS_DISTANCES = new int[]{20, 10, 5};

        for (int numberOfHops : kermitHops) {
            int totalDistance = 0;
            int hopsCounter = 0;
            for (int i = 0; i < numberOfHops; i++, hopsCounter++) {
                hopsCounter %= JUMPS_IN_ROUND;
                totalDistance += HOPS_DISTANCES[hopsCounter];
            }
            System.out.println(totalDistance);
        }
    }
}
