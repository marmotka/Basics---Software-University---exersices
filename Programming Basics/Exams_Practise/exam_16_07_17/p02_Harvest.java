package exam_16_07_17;


import java.text.DecimalFormat;
import java.util.Scanner;

public class p02_Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int area = Integer.parseInt(scan.nextLine());
        double produce = Double.parseDouble(scan.nextLine());
        int neededQuantity = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        DecimalFormat df1 = new DecimalFormat("#");

        double litersWine = (40 / 100.00 * area * produce) / 2.5;
        double difference = neededQuantity-litersWine;
        if (difference >0) {
            difference = Math.abs(difference);
            System.out.printf("It will be a tough winter! More %s liters wine needed.",df1.format(Math.floor(difference)));
        } else {
            difference = Math.abs(difference);
            System.out.printf("Good harvest this year! Total wine: %s liters.%n", df1.format(Math.floor(litersWine)));
            System.out.printf("%s liters left -> %s liters per person.",df1.format(Math.ceil(difference)),df1.format(Math.ceil(difference/workers)));
        }


    }
}
