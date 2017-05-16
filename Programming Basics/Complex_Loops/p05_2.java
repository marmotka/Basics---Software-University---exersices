package date_17_04_22_Complex_Loops;

import java.util.Scanner;

/**
 * Created by marmot on 22.4.2017 г..
 */
public class p05_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        while (num <=n){
            System.out.println(num);
            num = num*2+1;
        }
    }
}
