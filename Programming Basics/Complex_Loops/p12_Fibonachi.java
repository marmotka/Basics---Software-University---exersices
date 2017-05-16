package date_17_04_22_Complex_Loops;

import java.util.Scanner;

public class p12_Fibonachi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n < 2) {
            System.out.println("1");
        } else {
            int sum = 0;
            int a = 1;
            int b = 1;
            for (int i = 1; i < n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println(sum);
        }
    }
}
