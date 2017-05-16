package exam_16_11_20_morning;

import java.util.Scanner;

/**
 * Created by marmot on 26.4.2017 г..
 */
public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int adults = Integer.parseInt(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        String transport = scan.next().toLowerCase();
        double adultTransport = 0, studentsTransport = 0;

        switch (transport) {
            case ("train"):
                adultTransport = 24.99;
                studentsTransport = 14.99;
                break;
            case ("bus"):
                adultTransport = 32.50;
                studentsTransport = 28.50;
                break;
            case ("boat"):
                adultTransport = 42.99;
                studentsTransport = 39.99;
                break;
            case ("airplane"):
                adultTransport = 70.00;
                studentsTransport = 50.00;
                break;
        }
        double priceTransport = adults * adultTransport + students * studentsTransport;
        if (adults + students >= 50 && transport.equals("train")) {
            priceTransport = 0.5 * priceTransport;
        }
        double priceNights = 82.99 * nights;
        double total = 1.1 * (priceNights + priceTransport*2);

        System.out.printf("%.2f", total);

    }
}
