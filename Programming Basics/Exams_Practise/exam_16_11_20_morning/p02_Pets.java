package exam_16_11_20_morning;

import java.util.Scanner;

public class p02_Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int foodPlanned = Integer.parseInt(scan.nextLine());
        double dogFoodKg = Double.parseDouble(scan.nextLine());
        double catFoodKg = Double.parseDouble(scan.nextLine());
        double turtleFoodGrams = Double.parseDouble(scan.nextLine());

        double foodConsumed = days * (dogFoodKg + catFoodKg + turtleFoodGrams / 1000.0);

        double diff = foodPlanned-foodConsumed;
        if (diff>=0){
            System.out.printf("%d kilos of food left.", (int)Math.floor(diff));
        } else {
            System.out.printf("%d more kilos of food are needed.", (int)Math.ceil(Math.abs(diff)));

        }
    }
}
