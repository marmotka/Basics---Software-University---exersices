package exam_16_08_28;

import java.util.Scanner;

public class p02_Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double hoursWork = 0.9 * days * 8;
        int hoursExtraTime = workers * 2 * days;
        int hoursWorked = (int) Math.floor(hoursWork + hoursExtraTime);

        if (hoursWorked < hoursNeeded) {
            System.out.printf("Not enough time!%d hours needed.", ( hoursNeeded-hoursWorked));
        } else {
            System.out.printf("Yes!%d hours left.", (hoursWorked-hoursNeeded));
        }
    }
}
