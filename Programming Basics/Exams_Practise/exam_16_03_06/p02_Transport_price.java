package exam_16_03_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p02_Transport_price {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine().toLowerCase();
        double price;
        DecimalFormat df = new DecimalFormat("#.##");


        if (km < 20) {
            double tarife = (time.equals("day")) ? 0.79 : 0.9;
            price = 0.7+km*tarife;
        } else if (km >=20 && km < 100){
            price = 0.09*km;
        } else {
            price = 0.06*km;
        }
        System.out.println(df.format(price));
    }
}
