package exam_17_03_19;

import java.util.Scanner;

public class p03_truck_driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine().toLowerCase();
        double kmPerMonth = Double.parseDouble(scan.nextLine());
        double pricePerKm=1;
//        double money;
        if (kmPerMonth <= 5000) {
            switch (season) {
                case ("spring"):
                case ("autumn"):
                    pricePerKm = 0.75;
                    break;
                case ("summer"):
                    pricePerKm = 0.9;
                    break;
                case ("winter"):
                    pricePerKm = 1.05;
                    break;
            }
        } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
            switch (season) {
                case ("spring"):
                case ("autumn"):
                    pricePerKm = 0.95;
                    break;
                case ("summer"):
                    pricePerKm = 1.10;
                    break;
                case ("winter"):
                    pricePerKm = 1.25;
                    break;
            }
        } else  /* if (kmPerMonth > 10000 && kmPerMonth <= 20000) */ {
            pricePerKm = 1.45;
        }

        double money = (4 * kmPerMonth * pricePerKm) * 0.9;
        System.out.printf("%.2f", money);

    }
}

