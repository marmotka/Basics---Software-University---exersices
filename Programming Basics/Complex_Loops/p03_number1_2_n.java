package date_17_04_22_Complex_Loops;


import java.text.DecimalFormat;
import java.util.Scanner;

public class p03_number1_2_n {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        DecimalFormat df = new DecimalFormat("#");

        for (int i = 0; i <= n; i++) {
            System.out.println(df.format(Math.pow(2,i)));


        }
    }
}
