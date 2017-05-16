package date_17_04_22_Complex_Loops;

import java.util.Scanner;

public class p07_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c = Integer.parseInt(scan.nextLine());
        int d = Integer.parseInt(scan.nextLine());
        int b = Math.min(c, d);
        int a = Math.max(c, d);

        while (b != 0) {
            int oldB = b;
            b = a % b;
            a=oldB;

        }
        System.out.println(a);

    }

}

