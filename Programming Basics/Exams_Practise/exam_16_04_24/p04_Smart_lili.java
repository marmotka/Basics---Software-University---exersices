package exam_16_04_24;

import java.util.Scanner;

public class p04_Smart_lili {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int years = Integer.parseInt(scan.nextLine());
        double washPrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int toyCount = 0;
        int money = 0;
        int sum = 0;

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                money = (money + 10);
                sum = sum+money-1;
            } else {
                toyCount++;
            }
        }
        int moneyTotal = sum + toyCount * toyPrice;
        double diff = moneyTotal - washPrice;
        if (diff >= 0) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", Math.abs(diff));
        }

    }
}
