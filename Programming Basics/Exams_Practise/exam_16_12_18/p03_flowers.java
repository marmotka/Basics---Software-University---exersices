package exam_16_12_18;

import java.util.Scanner;

public class p03_flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int laleta = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine().toLowerCase();
        String holidayYesNo = scan.nextLine();
        boolean holiday = (holidayYesNo.equalsIgnoreCase("Y"));

        double hrprice = 1;
        double rosesprice = 1;
        double laletaprice = 1;

        switch (season) {
            case "spring":
            case "summer":
                hrprice = 2.00;
                rosesprice = 4.10;
                laletaprice = 2.5;
                break;
            case "autumn":
            case "winter":
                hrprice = 3.75;
                rosesprice = 4.5;
                laletaprice = 4.15;
                break;
        }
        if (holiday) {
            hrprice *= 1.15;
            rosesprice *= 1.15;
            laletaprice *= 1.15;
        }
        double price = hrizantemi * hrprice + roses * rosesprice + laleta * laletaprice;

        if (laleta > 7 && season.equals("spring")) {
            price *= 0.95;
        }
        if (roses >= 10 && season.equals("winter")) {
            price *= 0.9;
        }
        if ((laleta + roses + hrizantemi) > 20) {
            price *= 0.8;
        }
        System.out.printf("%.2f", (price + 2));


    }
}

