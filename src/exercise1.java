import java.util.ArrayList;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What times table would you like? ");
        int timesTable = reader.nextInt();
        ArrayList<Integer> t = new ArrayList<Integer>();
//        if (timesTable == 1){
//            System.out.println(timesTable + " x 1 = ");
//        }
//        for (int i = timesTable; i <= 12; i++){
//            if (i == 1){
//
//            }
//        }
        for (int i = 1; i <= 12; i++){
            t.add(timesTable * i);

        }
        System.out.println(t);
    }
}
