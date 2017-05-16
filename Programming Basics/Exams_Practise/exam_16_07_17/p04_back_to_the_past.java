package exam_16_07_17;


import java.text.DecimalFormat;
import java.util.Scanner;

public class p04_back_to_the_past {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int yearToLive = Integer.parseInt(scan.nextLine());
        int year = 18;
//        DecimalFormat df = new DecimalFormat("#.##")

        for (int i = 1800; i <= yearToLive; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money = money- 12000 - 50 * year;
            }
            year++;
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
