package exam_16_08_28;

import java.util.Scanner;

public class p03_Hotel_Room {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine().toLowerCase();
        int nights = Integer.parseInt(scan.nextLine());
        double studioPriceForNight = 0;
        double appPriceForNight = 0;

        switch (month) {
            case ("may"):
            case ("october"):
                studioPriceForNight = 50;
                appPriceForNight = 65;
                break;
            case ("june"):
            case ("september"):
                studioPriceForNight = 75.20;
                appPriceForNight = 68.70;
                break;
            case ("july"):
            case ("august"):
                studioPriceForNight = 76;
                appPriceForNight = 77;
                break;
        }
        double studioPrice = studioPriceForNight * nights;
        double appPrice = appPriceForNight * nights;

        if ((nights > 7 && nights <= 14) && (month.equals("may") || month.equals("october"))) {
            studioPrice *= 0.95;
        } else if (nights > 14 && (month.equals("may") || month.equals("october"))) {
            studioPrice *= 0.7;
        } else if (nights > 14 && (month.equals("june") || month.equals("september"))) {
            studioPrice *= 0.8;
        }
        if (nights > 14) {
            appPrice *= 0.9;
        }
        System.out.printf("Apartment: %.2f lv.%n", appPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);


    }
}
