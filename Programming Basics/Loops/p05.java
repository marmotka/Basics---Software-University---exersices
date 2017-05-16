package date_17_04_02_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/1/2017.
 */
public class p05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.println(biggest);


    }
}
