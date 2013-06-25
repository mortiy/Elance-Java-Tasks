import java.text.DateFormatSymbols;
import java.util.*;

public class Main {
    public static void main(String [] args){

        int DAY_OF_MONTH = 28;

        List<Integer> days = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("[-\\s]+");
        Calendar calendar = Calendar.getInstance();
        while (days.size() < 2) {
            calendar.set(scanner.nextInt(), scanner.nextInt(), DAY_OF_MONTH);
            days.add(calendar.get(Calendar.DAY_OF_WEEK));
        }

        String[] weekdays = DateFormatSymbols.getInstance(Locale.US).getWeekdays();

        for(Integer weekday : days){
            System.out.println(weekdays[weekday].toUpperCase());
        }
    }
}
