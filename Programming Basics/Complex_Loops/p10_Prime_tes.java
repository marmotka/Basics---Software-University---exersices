package date_17_04_22_Complex_Loops;

import java.util.Scanner;


public class p10_Prime_tes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        if (n < 2) {
            System.out.println("Not prime");
        } else {
            int prime = 0;
            for (int i = 2; i <=Math.sqrt(n) ; i++) {
                if (n % i == 0) {
                    prime = 1;
                }
            }
            if (prime == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
