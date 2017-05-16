package exam_17_03_19_morning;

import java.util.Scanner;

public class p01_House_painting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double green = ((2 * x * x) + (2 * x * y) - (1.2 * 2) - (2*1.5 * 1.5))/3.4;
        double red = (2*x*y+x*h)/4.3;

        System.out.printf("%.2f%n",green);
        System.out.printf("%.2f",red);

    }
}
