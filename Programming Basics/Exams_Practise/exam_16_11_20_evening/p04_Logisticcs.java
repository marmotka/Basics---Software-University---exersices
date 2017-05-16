package exam_16_11_20_evening;

import java.util.Scanner;

/**
 * Created by marmot on 26.4.2017 г..
 */
public class p04_Logisticcs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loads = Integer.parseInt(scan.nextLine());
        double sumLoads = 0;
        int tonesTill3 = 0;
        int tonesTill12 = 0;
        int tonesOver12 = 0;

        for (int i = 0; i < loads; i++) {
            int weightLoad = Integer.parseInt(scan.nextLine());
            sumLoads += weightLoad;
            if (weightLoad < 4) {
                tonesTill3 += weightLoad;
            } else if (weightLoad >= 4 && weightLoad < 12) {
                tonesTill12 += weightLoad;
            } else {
                tonesOver12 += weightLoad;
            }
        }
        double average = (200*tonesTill3+175.0*tonesTill12+120*tonesOver12)/sumLoads;
        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", tonesTill3*100.0/sumLoads);
        System.out.printf("%.2f%%%n", tonesTill12*100.0/sumLoads);
        System.out.printf("%.2f%%%n", tonesOver12*100.0/sumLoads);
    }
}
