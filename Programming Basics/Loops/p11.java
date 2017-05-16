package date_17_04_02_Loops;
import java.text.DecimalFormat;
import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        DecimalFormat df = new DecimalFormat("#.##");


        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += num;

                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            }
            if (i % 2 != 0) {
                oddSum += num;

                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            }

        }
        if (n == 0) {

            System.out.printf("oddSum=0%n");
            System.out.printf("oddMin=No%n");
            System.out.printf("oddMax=No%n");
            System.out.printf("evenSum=0%n");
            System.out.printf("evenMin=No%n");
            System.out.printf("evenMax=No");
        } else if (n == 1) {
            System.out.printf("oddSum=%s%n", df.format(oddSum));
            System.out.printf("oddMin=%s%n", df.format(oddMin));
            System.out.printf("oddMax=%s%n", df.format(oddMax));
            System.out.printf("evenSum=0%n");
            System.out.printf("evenMin=No%n");
            System.out.printf("evenMax=No%n");
        } else {
            System.out.printf("oddSum=%s%n", df.format(oddSum));
            System.out.printf("oddMin=%s%n", df.format(oddMin));
            System.out.printf("oddMax=%s%n", df.format(oddMax));
            System.out.printf("evenSum=%s%n", df.format(evenSum));
            System.out.printf("evenMin=%s%n", df.format(evenMin));
            System.out.printf("evenMax=%s%n", df.format(evenMax));
        }


    }
}
