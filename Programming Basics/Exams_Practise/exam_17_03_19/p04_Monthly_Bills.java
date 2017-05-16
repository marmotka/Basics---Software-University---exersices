package exam_17_03_19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p04_Monthly_Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int months = Integer.parseInt(scan.nextLine());
        int water = 20;
        int waterall = water * months;
        int internet = 15;
        int internetall = internet * months;

        double electrsum = 0;
        double others = 0;
        double otherssum = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scan.nextLine());
            electrsum += electricity;
            others = (water + internet + electricity) * 1.2;
            otherssum += others;
        }

        System.out.printf("Electricity: %.2f lv%n", electrsum);
        System.out.printf("Water: %s lv%n", df.format(waterall));
        System.out.printf("Internet: %s lv%n", df.format(internetall));
        System.out.printf("Other: %.2f lv%n", otherssum);
        System.out.printf("Average: %.2f lv", ((water * months + internet * months + electrsum + otherssum) / months));

    }
}
