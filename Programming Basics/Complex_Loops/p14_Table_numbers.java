package date_17_04_22_Complex_Loops;

import java.util.Scanner;

public class p14_Table_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        int numright;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                num = row + col + 1;
                System.out.printf("%d ", num);
                if (row > 0 && num == n) {
                    break;
                }
            }
            if (row > 0) {
                numright = 2 * n - num - 1;
                for (int i = 0; i < row; i++) {
                    System.out.printf("%d ", numright);
                    numright--;
                }
            }
            System.out.println();
        }
    }
}
