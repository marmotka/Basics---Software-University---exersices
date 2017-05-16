package exam_16_08_28;

import java.util.Scanner;

public class p06_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int firstDigit = n / 100;
        int secondDigit = (n - firstDigit * 100) / 10;
        int thirdDigit = n - firstDigit * 100 - secondDigit * 10;

        int rows = firstDigit + secondDigit;
        int col = firstDigit + thirdDigit;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (n % 5 == 0) {
                    n -= firstDigit;
                } else if (n % 3 == 0) {
                    n -= secondDigit;
                } else {
                    n += thirdDigit;
                }
                System.out.printf("%d ",n);
            }
            System.out.println();
        }
    }
}
