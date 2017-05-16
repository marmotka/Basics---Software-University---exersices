package exam_16_08_28;

import java.util.Scanner;


public class p01_Dayly_profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int workdays = Integer.parseInt(scan.nextLine());
        double moneyForDay = Double.parseDouble(scan.nextLine());
        double rate = Double.parseDouble(scan.nextLine());

        double moneyForMonth = moneyForDay * workdays;
        double moneyForYear = moneyForMonth * 2.5 + moneyForMonth * 12;
        double moneyAfterTaxes = moneyForYear * 0.75;
        double yearLeva = moneyAfterTaxes * rate;
        double dayLeva = yearLeva / 365;

        System.out.printf("%.2f", dayLeva);

    }
}
