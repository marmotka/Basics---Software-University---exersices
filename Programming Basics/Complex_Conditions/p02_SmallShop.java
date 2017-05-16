package date_17_03_25_Complex_Conditions;

import java.text.DecimalFormat;
import java.util.Scanner;


public class p02_SmallShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine().toLowerCase();
        String city = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        if (product.equals("coffee")) {
            switch (city) {
                case ("sofia"):
                    System.out.println(df.format(.5 * quantity));

                    break;
                case ("plovdiv"):
                    System.out.println(df.format(0.4 * quantity));

                    break;
                case ("varna"):
                    System.out.println(df.format(0.45 * quantity));

                    break;
            }
        } else if (product.equals("water")) {
            switch (city) {
                case ("sofia"):
                    System.out.println(df.format(0.8 * quantity));

                    break;
                case ("plovdiv"):
                    System.out.println(df.format(0.7 * quantity));

                    break;
                case ("varna"):
                    System.out.println(df.format(0.7 * quantity));

                    break;
            }
        } else if (product.equals("beer")) {
            switch (city) {
                case ("sofia"):
                    System.out.println(df.format(1.2 * quantity));

                    break;
                case ("plovdiv"):
                    System.out.println(df.format(1.15 * quantity));

                    break;
                case ("varna"):
                    System.out.println(df.format(1.1 * quantity));

                    break;
            }
        } else if (product.equals("sweets")) {
            switch (city) {

                case ("sofia"):
                    System.out.println(df.format(1.45 * quantity));

                    break;
                case ("plovdiv"):
                    System.out.println(df.format(1.3 * quantity));

                    break;
                case ("varna"):
                    System.out.println(df.format(1.35 * quantity));

                    break;
            }
        } else if (product.equals("peanuts")) {
            switch (city) {
                case ("sofia"):
                    System.out.println(df.format(1.6 * quantity));

                    break;
                case ("plovdiv"):
                    System.out.println(df.format(1.5 * quantity));

                    break;
                case ("varna"):
                    System.out.println(df.format(1.55 * quantity));

                    break;
            }
        }
    }
}

