package date_17_04_22_Complex_Loops;

import java.util.Scanner;

public class p01_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int i=1;
        while (i<n){
            System.out.println(i);
            i+=3;
        }
    }
}
