package date_17_04_02_Loops;

import java.util.Scanner;

public class p14_Divide_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double interval2 = 0;
        double interval3 = 0;
        double interval4 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num % 2 == 0) {
                interval2++;
            }
            if (num % 3 == 0) {
                interval3++;
            }
            if (num % 4 == 0) {
                interval4++;
            }
        }
        System.out.printf("%.2f%%%n", interval2 / n * 100);
        System.out.printf("%.2f%%%n", interval3 / n * 100);
        System.out.printf("%.2f%%%n", interval4 / n * 100);
    }

}
