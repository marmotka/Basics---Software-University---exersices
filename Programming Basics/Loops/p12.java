package date_17_04_02_Loops;
import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        //    int sumThird = 0;
        int maxDiff = Integer.MIN_VALUE;
        //   int sum = 0;

        if (n == 1) {
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());
            //sum = num1 + num2;
            System.out.printf("Yes, value=%d", (num1 + num2));

        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    int num1 = Integer.parseInt(scan.nextLine());
                    int num2 = Integer.parseInt(scan.nextLine());
                    sum = num1 + num2;

                } else {

                    int num1 = Integer.parseInt(scan.nextLine());
                    int num2 = Integer.parseInt(scan.nextLine());
                    int diff = Math.abs((num1 + num2) - sum);

                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                    sum = num1 + num2;

                }
            }
            if (maxDiff == 0) {
                System.out.printf("Yes,value =%d", sum);
            } else {
                System.out.printf("No, maxdiff = %d", maxDiff);
            }
        }
    }
}
