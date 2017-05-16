package exam_16_11_20_evening;

import java.util.Scanner;

public class p01_House_price {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double minRoom = Double.parseDouble(scan.nextLine());
        double kitchen = Double.parseDouble(scan.nextLine());
        double pricePerSquareMet = Double.parseDouble(scan.nextLine());

        double bath = minRoom / 2.0;
        double secondRoom = 1.1 * minRoom;
        double thirdRoom = 1.1 * secondRoom;

        double appSqMeter = 1.05 * (kitchen + bath + minRoom + secondRoom + thirdRoom);
        System.out.printf("%.2f", appSqMeter*pricePerSquareMet);

    }
}
