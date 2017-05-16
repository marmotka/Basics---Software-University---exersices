package date_17_04_22_Complex_Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by marmot on 22.4.2017 г..
 */
public class p04_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
//        DecimalFormat df = new DecimalFormat("#");

        for (int i = 0; i <= n; i+=2) {
//            System.out.println(df.format(Math.pow(2,i)));
            System.out.println((int)(Math.pow(2,i)));

        }
    }
}
