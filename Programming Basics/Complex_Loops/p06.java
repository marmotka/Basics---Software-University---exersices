package date_17_04_22_Complex_Loops;

import java.util.Scanner;


public class p06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        while ( n <1 || n>100 ) {
            System.out.println("Invalid number");
            n = Integer.parseInt(scan.nextLine());

        }
        System.out.println("The number is : " +n);
//        n = Integer.parseInt(scan.nextLine());
    }
}
