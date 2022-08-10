import java.util.Arrays;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();

        //System.out.println(Arrays.toString(letters) + " ");
        int l = letters.length;
        for (int i = l; i > 0; i--){
            System.out.print(letters[i - 1]);
        }
    }
}
