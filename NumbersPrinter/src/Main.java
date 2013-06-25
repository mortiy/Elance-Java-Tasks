public class Main {
    public static void main(String[] args) {

        final int START_NUMBER = 258;
        final int END_NUMBER = 393;

        for(int i = START_NUMBER; i <= END_NUMBER; i++){
            if(i % 10 == 5 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
