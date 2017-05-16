package exam_16_11_20_evening;

import java.util.Scanner;

public class p03_Bike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juniorsRiders = Integer.parseInt(scan.nextLine());
        int seniorsRiders = Integer.parseInt(scan.nextLine());
        String trace = scan.next().toLowerCase();

        double juniorTax = 0.0;
        double seniorTax = 0.0;

        switch (trace) {
            case ("trail"):
                juniorTax = 5.5;
                seniorTax = 7.0;
                break;
            case ("cross-country"):
                juniorTax = 8.0;
                seniorTax = 9.5;
                break;
            case ("downhill"):
                juniorTax = 12.25;
                seniorTax = 13.75;
                break;
            case ("road"):
                juniorTax = 20.0;
                seniorTax = 21.50;
                break;
        }
        if (trace.equals("cross-country") && (juniorsRiders + seniorsRiders >= 50)) {
            juniorTax *= 0.75;
            seniorTax *= 0.75;
        }
        double sum = juniorsRiders * juniorTax + seniorsRiders * seniorTax;
        sum = 0.95 * sum;
        System.out.printf("%.2f", sum);


    }
}
