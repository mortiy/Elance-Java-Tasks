import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> levels = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (levels.size() < 3) {
            levels.add(scanner.nextInt());
        }

        for(int level : levels){
            for(int i = 1; i <= level; i++){
                System.out.print(repeat(" ", level - i));
                System.out.println(repeat(i + " ", i));
            }
        }
    }

    static String repeat(String string, int times){
        return new String(new char[times]).replace("\0", string);
    }

}
