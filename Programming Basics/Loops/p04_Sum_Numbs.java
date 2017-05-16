package date_17_04_02_Loops;
import java.util.Scanner;

public class p04_Sum_Numbs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(scan.nextLine());

        }
        System.out.println(sum);
    }
}

