package exam_16_11_20_morning;

import java.util.Scanner;

public class p01_Fish_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double skumriaPr = Double.parseDouble(scan.nextLine());
        double cacaPr = Double.parseDouble(scan.nextLine());
        double palamudkg = Double.parseDouble(scan.nextLine());
        double safridkg = Double.parseDouble(scan.nextLine());
        int midikg = Integer.parseInt(scan.nextLine());

        double palamudPr = 1.6 * skumriaPr;
        double safridPr = 1.8 * cacaPr;
        double midiPr = 7.5;
        double totale = palamudPr * palamudkg + safridPr * safridkg + midikg * midiPr;
        System.out.printf("%.2f",totale);

    }
}
