package date_17_04_22_Complex_Loops;

import java.util.Scanner;

public class p08_2_do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int fact = 1;

//        do {
//            fact = fact * n;
//            n--;
//        }
//        while(n>0);

        while (n > 1)   {
            fact = fact * n;
            n--;
        }


        System.out.println(fact);


    }
}
