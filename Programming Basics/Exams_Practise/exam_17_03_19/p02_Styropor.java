package exam_17_03_19;

import java.util.Scanner;

public class p02_Styropor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budjet = Double.parseDouble(scan.nextLine());
        double areaHouse = Double.parseDouble(scan.nextLine());
        int windows = Integer.parseInt(scan.nextLine());
        double sqMStyropor = Double.parseDouble(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());

        double areaToCover = (areaHouse - windows * 2.4) * 1.1;
        double packets = Math.ceil(areaToCover / sqMStyropor);
        double moneyNeeded = packets * price;
        double diff = budjet-moneyNeeded;

        if (diff >=0){
            System.out.printf("Spent: %.2f%n",moneyNeeded);
            System.out.printf("Left: %.2f",diff);
        } else {
            System.out.printf("Need more: %.2f",Math.abs(diff));

        }
    }
}
