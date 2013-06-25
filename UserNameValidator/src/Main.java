import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        List<String> userNames = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while(userNames.size() < 4){
            userNames.add(scanner.nextLine());
        }

        for(String username : userNames){
            if ( (username.length() >= 5 && username.length() <= 10)
                 && username.matches(".*[A-Z].*")
                 && username.matches(".*\\d.*")
                 && username.matches(".*[@#\\*=].*")
                 && !username.matches(".*\\s.*")
            ){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
