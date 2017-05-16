package date_17_04_22_Complex_Loops;

import java.util.Scanner;

/**
 * Created by marmot on 22.4.2017 г..
 */
public class p09_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (n>=1){
//        for (int i = n; i > 0; i = i / 10) {
            sum = sum + (n % 10);
            n=n/10;
        }
        System.out.println(sum);

    }
}
