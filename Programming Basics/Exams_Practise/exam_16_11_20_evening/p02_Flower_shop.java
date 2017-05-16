package exam_16_11_20_evening;

import java.util.Scanner;

public class p02_Flower_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magnolii = Integer.parseInt(scan.nextLine());
        int zumbuli = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int cactus = Integer.parseInt(scan.nextLine());
        double pricePresent = Double.parseDouble(scan.nextLine());

        double priceFlowers = magnolii * 3.25 + zumbuli * 4 + roses * 3.5 + cactus * 8;
        double flowersAftertxes = 0.95 * priceFlowers;
        double priceDifference = flowersAftertxes - pricePresent;
        if (priceDifference>=0){
            System.out.printf("She is left with %d leva.", (int)Math.floor(priceDifference));
        } else {
            System.out.printf("She will have to borrow %d leva.", (int) Math.ceil(Math.abs(priceDifference)));
        }

    }
}
