import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<Integer> timeIntervals = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while(timeIntervals.size() < 2){
            timeIntervals.add(scanner.nextInt());
        }

        final int INITIAL_SPEED = 36; // km/hr
        final int ACCELERATION = 5; // m/s2

        for(Integer seconds : timeIntervals){
            double convertedSpeed = INITIAL_SPEED * 1000 / 3600; // Convert speed to m/s
            double distance = convertedSpeed * seconds + ( (ACCELERATION * Math.pow(seconds, 2)) / 2f);
            System.out.println(Math.round(distance));
        }

    }
}
