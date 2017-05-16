package date_17_04_22_Complex_Loops;

import java.util.Scanner;

 class p14_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int num = i + j + 1;
                if (num > n) {
                    num = 2 * n - num;
                }
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
