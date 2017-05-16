package date_17_04_02_Loops;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;


public class p10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum += num;
            if (num > biggest) {
                biggest = num;
            }
        }
        if (sum-biggest == biggest){
        System.out.printf("Yes Sum = %d", biggest);}
        else {
            System.out.printf("No Diff = %d", Math.abs(biggest-(sum-biggest)));
        }
    }
}
