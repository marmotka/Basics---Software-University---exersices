package date_17_04_22_Complex_Loops;

import java.util.Scanner;

public class p13_Pyramid_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.printf("%d ", num);
                num++;
                if (num == n + 1) {
                    return;
                }
            } System.out.println();
        }
    }
}

