package exam_16_03_06;

import java.util.Scanner;

public class p01_Classroom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        int countRows = (int) ((h*100-100)/70);
        int countColumns = (int) (w*100/120);
        int seats = countColumns*countRows - 3;

        System.out.println(seats);
    }

}
