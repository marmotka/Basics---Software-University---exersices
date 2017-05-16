package date_17_04_22_Complex_Loops;

import java.util.Scanner;

public class p04_Evens_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        for (int i = 0; i <=n ; i+=2) {
            System.out.println(num);
            num *=4;

        }
    }
}
