package exam_17_03_19;


import java.util.Scanner;

public class p01_Grape_Rakiya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area = Double.parseDouble(scan.nextLine());
        double grapePerSqM = Double.parseDouble(scan.nextLine());
        double waste = Double.parseDouble(scan.nextLine());

        double grapesTotal = area * grapePerSqM - waste;
        double rakiyaIncome = ((0.45 * grapesTotal) / 7.5) * 9.8;
        double grapeIncome = 0.55 * grapesTotal * 1.5;
        System.out.printf("%.2f%n",rakiyaIncome);
        System.out.printf("%.2f",grapeIncome);

    }
}
