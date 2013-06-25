import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(",");

        int difference = sum(words[0]) - sum(words[1]);
        System.out.println(difference);

    }

    public static int sum(String word){
        int sum = 0;
        for(char c : word.toCharArray()){
            sum += c;
        }
        return sum;
    }
}
