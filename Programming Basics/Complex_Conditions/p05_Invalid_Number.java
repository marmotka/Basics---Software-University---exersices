package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p05_Invalid_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if (!((n >= 100 && n <= 200) || n==0)) {
            System.out.println("invalid");
        }
    }
}
