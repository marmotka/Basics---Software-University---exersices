package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p03_Dot_Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        if (x >= x1
                && x <= x2
                && y >= y1
                && y <= y2) {

            System.out.println("Inside");
        } else System.out.println("Outside");

    }
}
