package date_17_04_22_Complex_Loops;

import java.util.Scanner;

/**
 * Created by marmot on 23.4.2017 г..
 */
public class p13_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.printf("%d ", num);
                num++;
                if (num > n) {
                    break;
                }
            }
            System.out.println();
            if (num > n) {
                break;
            }
        }
    }
}

