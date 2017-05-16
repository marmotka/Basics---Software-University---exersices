package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine().toLowerCase();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        int seats = rows * columns;
        double price = 1.0;


        switch (type) {
            case "premiere":
                price = 12.0;
                break;
            case "normal":
                price = 7.5;
                break;
            case "discount":
                price = 5.0;
                break;
        }
        double income = price * seats;
        System.out.printf("%.2f",income);
    }
}
