package EXAM_2017_05_07;

import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());
        double fans = Double.parseDouble(scan.nextLine());

        int aSector =0;
        int bSector =0;
        int vSector =0;
        int gSector =0;

        for (int i = 0; i < fans; i++) {
            String sector = scan.nextLine();
            switch (sector) {
                case "A":
                    aSector++;
                    break;
                case "B":
                    bSector++;
                    break;
                case "V":
                    vSector++;
                    break;
                case "G":
                    gSector++;
                    break;
            }
        }
        double allToCapacity = fans/capacity*100.0;

        System.out.printf("%.2f%%%n", (aSector/fans)*100.0);
        System.out.printf("%.2f%%%n", (bSector/fans)*100.0);
        System.out.printf("%.2f%%%n", (vSector/fans)*100.0);
        System.out.printf("%.2f%%%n", (gSector/fans)*100.0);
        System.out.printf("%.2f%%%n", allToCapacity);



    }

}
