package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p14_Training_Lab {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hEx = Integer.parseInt(scan.nextLine());
        int mEx = Integer.parseInt(scan.nextLine());
        int hArr = Integer.parseInt(scan.nextLine());
        int mArr = Integer.parseInt(scan.nextLine());

        int exTimeMin = hEx * 60 + mEx;
        int arrTimeMin = hArr * 60 + mArr;

        int timeDifference = arrTimeMin - exTimeMin;

        if (timeDifference < -30) {
            System.out.printf("Early%n");

        } else if (timeDifference <= 0) {
            System.out.printf("On time%n");
        } else {
            System.out.printf("Late%n");

        }

        int h = Math.abs(timeDifference / 60);
        int m = Math.abs(timeDifference % 60);

        if (h == 0) {
            if (timeDifference > 0) {
                System.out.printf("%d minutes after the start", m);
            } else if (timeDifference < 0) {
                System.out.printf("%d minutes before the start", m);
            }
        } else if (h > 0) {
            if (timeDifference > 0) {
                System.out.printf("%d:%02d hours after the start",h, m);
            } else if (timeDifference < 0) {
                System.out.printf("%d:%02d hours before the start",h, m);
            }

        }




    }

}

