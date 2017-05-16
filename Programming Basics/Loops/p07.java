package date_17_04_02_Loops;
import java.util.Scanner;


public class p07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i < n; i++) {
            sum2 += Integer.parseInt(scan.nextLine());
        }

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d",sum1);
        } else {
            int dif= Math.abs(sum1-sum2);
            System.out.printf("No, diff = %d",dif);
        }
        }
    }
