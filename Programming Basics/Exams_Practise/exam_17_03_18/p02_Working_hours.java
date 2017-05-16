package exam_17_03_18;

import java.util.Scanner;

/**
 * Created by marmot on 23.4.2017 г..
 */
public class p02_Working_hours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int workdays = Integer.parseInt(scan.nextLine());

        int hoursWorked = workers * workdays * 8;
        int diff = hoursWorked-hoursNeeded;
        if (diff > 0) {
            System.out.printf("%d hours left",diff);
        } else {
            System.out.printf("%d overtime%n", Math.abs(diff));
            System.out.printf("Penalties: %d", Math.abs(diff*workdays));

        }

    }
}
