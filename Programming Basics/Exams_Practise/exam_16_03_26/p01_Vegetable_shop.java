package exam_16_03_26;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p01_Vegetable_shop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double priceVeg = Double.parseDouble(scan.nextLine());
        double priceFruit = Double.parseDouble(scan.nextLine());
        int weightVeg = Integer.parseInt(scan.nextLine());
        int weightFruit = Integer.parseInt(scan.nextLine());

        double incomes = (priceVeg * weightVeg + priceFruit * weightFruit) / 1.94;
        DecimalFormat df = new DecimalFormat("#.#############");
        System.out.print(df.format(incomes));
    }
}