package EXAM_2017_05_07;

import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double priceExcursion = Double.parseDouble(scan.nextLine());
        int puzzleQuantity = Integer.parseInt(scan.nextLine());
        int dools = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double puzzlePrice = 2.60;
        double doolPrise = 3.0;
        double bearPrice = 4.10;
        double minionPrise = 8.20;
        double truckPrise = 2.0;

        double moneyPorychka = puzzlePrice * puzzleQuantity + dools * doolPrise + bears * bearPrice + minions * minionPrise + trucks * truckPrise;
        if (dools + bears + minions + trucks >= 50) {
            moneyPorychka = (75 / 100.0) * moneyPorychka;
        }
        moneyPorychka = (90 / 100.0) * moneyPorychka;

        double diff = moneyPorychka - priceExcursion;
        if (moneyPorychka >= priceExcursion) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(diff));
        }
    }
}

