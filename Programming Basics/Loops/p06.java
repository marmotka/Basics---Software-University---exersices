package date_17_04_02_Loops;
import java.util.Scanner;


public class p06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println(smallest);

    }

}
