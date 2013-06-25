import java.util.*;

public class Main {

    public static void main(String [] args){

        final Map<Integer, Integer> students = new HashMap<Integer, Integer>();

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[-\n]");

        int recordsCounter = 0;

        while (recordsCounter < 10) {

            int studentId = scanner.nextInt();
            int studentMark = scanner.nextInt();

            if(students.containsKey(studentId)){
                if(students.get(studentId) < studentMark){
                    students.put(studentId, studentMark);
                }
            } else {
                students.put(studentId, studentMark);
            }
            recordsCounter++;
        }

        List<Integer> studentsIdSortedByMark = new ArrayList<Integer>();
        studentsIdSortedByMark.addAll(students.keySet());

        Collections.sort(studentsIdSortedByMark, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return students.get(o2).compareTo(students.get(o1));
            }
        });

        for(Integer studentId : studentsIdSortedByMark){
            System.out.printf("%d-%d\n", studentId, students.get(studentId));
        }
    }


}
