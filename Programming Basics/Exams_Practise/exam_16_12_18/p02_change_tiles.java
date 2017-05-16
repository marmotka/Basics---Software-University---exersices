package exam_16_12_18;

import java.util.Scanner;

public class p02_change_tiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneySaved = Double.parseDouble(scan.nextLine());
        double widthRoom = Double.parseDouble(scan.nextLine());
        double lenghtRoom = Double.parseDouble(scan.nextLine());
        double sideTile = Double.parseDouble(scan.nextLine());
        double hieghtTile = Double.parseDouble(scan.nextLine());
        double priceTile = Double.parseDouble(scan.nextLine());
        double moneyForWorker = Double.parseDouble(scan.nextLine());

        int quantityTiles = (int) Math.ceil((widthRoom * lenghtRoom) / ((hieghtTile * sideTile) / 2)) + 5;
        double priceTotal = quantityTiles*priceTile + moneyForWorker;

        double diff = moneySaved-priceTotal;
        if (diff >=0){
            System.out.printf("%.2f lv left.", diff);
        } else {
            System.out.printf("You'll need %.2f lv more.", Math.abs(diff));
        }
    }
}
