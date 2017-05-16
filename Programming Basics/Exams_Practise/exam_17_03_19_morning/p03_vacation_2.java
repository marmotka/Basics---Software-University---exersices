package exam_17_03_19_morning;

import java.util.Scanner;

public class p03_vacation_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();
        String location = "";
        String accommodation = "";
        double price = 1;

        if (budget <= 1000) {
            accommodation = "Camp";
            switch (season) {
                case ("summer"):
                    location = "Alaska";
                    price = 0.65 * budget;
                    break;
                case ("winter"):
                    location = "Morocco";
                    price = 0.45 * budget;
                    break;
            }
        } else if (budget > 1000 && budget <= 3000) {
            accommodation = "Hut";
            switch (season) {
                case ("summer"):
                    location = "Alaska";
                    price = 0.8 * budget;
                    break;
                case ("winter"):
                    location = "Morocco";
                    price = 0.6 * budget;
                    break;
            }
        } else {
            price = 0.9 * budget;
            accommodation = "Hotel";
            location = season.equals("summer") ? "Alaska" : "Morocco";
        }
        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
