package date_17_04_02_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/1/2017.
 */
public class p08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum1 += Integer.parseInt(scan.nextLine());
            } else if (i % 2 != 0) {
                sum2 += Integer.parseInt(scan.nextLine());
            }
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d",sum1);
        } else {
            int dif= Math.abs(sum1-sum2);
            System.out.printf("No, diff = %d",dif);
        }

    }
}
