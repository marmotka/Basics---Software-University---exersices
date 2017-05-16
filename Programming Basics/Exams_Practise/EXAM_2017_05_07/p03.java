package EXAM_2017_05_07;

import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine().toLowerCase();
        String typeGroup = scan.nextLine().toLowerCase();
        int students = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());

        double boysGirlsPrice = 0;
        double mixedPrice = 0;

        switch (season) {
            case "winter":
                boysGirlsPrice = 9.60;
                mixedPrice = 10;
                break;
            case "spring":
                boysGirlsPrice = 7.20;
                mixedPrice = 9.50;
                break;
            case "summer":
                boysGirlsPrice = 15;
                mixedPrice = 20;
                break;
        }
        double price = 0.0;
        if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
            price = boysGirlsPrice * nights * students;
        } else {
            price = mixedPrice * nights * students;
        }
        if (students >= 50) {
            price = 0.5 * price;
        } else if (students >= 20 && students < 50) {
            price = (85 / 100.0) * price;
        } else if (students >= 10 && students < 20) {
            price = (95 / 100.0) * price;
        }

        String sport = "";
        if (season.equals("winter")) {
            if (typeGroup.equals("girls")) {
                sport = "Gymnastics";
            } else if (typeGroup.equals("boys")) {
                sport = "Judo";
            } else if (typeGroup.equals("mixed")) {
                sport = "Ski";
            }
        } else if (season.equals("spring")) {
            if (typeGroup.equals("girls")) {
                sport = "Athletics";
            } else if (typeGroup.equals("boys")) {
                sport = "Tennis";
            } else if (typeGroup.equals("mixed")) {
                sport = "Cycling";
            }
        } else if (season.equals("summer")) {
            if (typeGroup.equals("girls")) {
                sport = "Volleyball";
            } else if (typeGroup.equals("boys")) {
                sport = "Football";
            } else if (typeGroup.equals("mixed")) {
                sport = "Swimming";
            }
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}
