package exam_16_03_06;

import java.util.Scanner;

/**
 * Created by marmot on 2.5.2017 г..
 */
public class p04_Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int under200 = 0;
        int under400 = 0;
        int under600 = 0;
        int under800 = 0;
        int over800 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < 200) {
                under200++;
            } else if (num >= 200 && num < 400) {
                under400++;
            } else if (num >= 400 && num < 600) {
                under600++;
            } else if (num >= 600 && num < 800) {
                under800++;
            } else {
                over800++;
            }
        }
        System.out.printf("%.2f%%%n", under200*100.0/n);
        System.out.printf("%.2f%%%n", under400*100.0/n);
        System.out.printf("%.2f%%%n", under600*100.0/n);
        System.out.printf("%.2f%%%n", under800*100.0/n);
        System.out.printf("%.2f%%%n", over800*100.0/n);


    }
}
