
package date_17_04_02_Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by marmot on 4/2/2017.
 */
public class p13_Histogram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        //  DecimalFormat df = new

        double interval1 = 0;
        double interval2 = 0;
        double interval3 = 0;
        double interval4 = 0;
        double interval5 = 0;


        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scan.nextLine());
            if (num < 200) {
                interval1++;
            } else if (num >= 200 && num < 400) {
                interval2++;
            } else if (num >= 400 && num < 600) {
                interval3++;
            } else if (num >= 600 && num < 800) {
                interval4++;
            } else {
                interval5++;
            }

        }
        System.out.printf("%.2f%s%n", interval1 / n * 100,"%");
        System.out.printf("%.2f%%%n", interval2 / n * 100);
        System.out.printf("%.2f%%%n", interval3 / n * 100);
        System.out.printf("%.2f%%%n", interval4 / n * 100);
        System.out.printf("%.2f%%%n", interval5 / n * 100);

    }

}
