import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> sentences = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (sentences.size() < 3) {
            sentences.add(scanner.nextLine());
        }

        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        for(String sentence : sentences){
            Matcher matcher = pattern.matcher(sentence);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }

    }
}
