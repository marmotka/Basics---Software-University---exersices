package EXAM_2017_05_07;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scan.nextLine());
        double beerQuantity = Double.parseDouble(scan.nextLine());
        double wineQuantity = Double.parseDouble(scan.nextLine());
        double rakiyaQuantity = Double.parseDouble(scan.nextLine());
        double whiskeyQuantity = Double.parseDouble(scan.nextLine());

        double rakiyaPrice = whiskeyPrice/2.0;
        double winePrice = (60/100.0)*rakiyaPrice;
        double beerPrice = (20/100.0)*rakiyaPrice;
        double money = whiskeyPrice*whiskeyQuantity + beerPrice*beerQuantity+winePrice*wineQuantity + rakiyaPrice*rakiyaQuantity;
        System.out.printf("%.2f", money);

    }
}
