import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int sumTotal = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int i = 0;
        while (i <= sumTo){
            sumTotal = sumTotal + i;
            //System.out.print(sumTotal);
            i++;

        }
        System.out.println(sumTotal);
    }
}
