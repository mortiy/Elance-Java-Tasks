import java.util.*;

public class Main {
    public static void main(String[] args){

        Set<String> employees = new HashSet<String>();

        Scanner scanIn = new Scanner(System.in);
        String firstEvent = scanIn.nextLine();
        String secondEvent = scanIn.nextLine();


        int commonVisitorsCount = 0;

        if(firstEvent.length() > 0 && secondEvent.length() > 0){

            String[] firstEventEmployees = firstEvent.split(",");
            String[] secondEventEmployees = secondEvent.split(",");

            employees.addAll(Arrays.asList(firstEventEmployees));

            for(String employeeId : secondEventEmployees){
                if(employees.contains(employeeId)){
                    commonVisitorsCount++;
                }
            }
        }

        System.out.println(commonVisitorsCount);

    }
}
