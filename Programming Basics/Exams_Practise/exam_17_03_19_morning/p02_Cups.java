package exam_17_03_19_morning;

import java.util.Scanner;

public class p02_Cups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cupsPlanned = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int daysWork = Integer.parseInt(scan.nextLine());

        double cupsMade = Math.floor(workers * 8 * daysWork / 5.0);
        double moneydiff = (cupsMade - cupsPlanned) * 4.2;
        if (moneydiff >= 0) {
            System.out.printf("%.2f extra money", moneydiff);
        } else {
            System.out.printf("Losses: %.2f", Math.abs(moneydiff));
        }
    }
}
