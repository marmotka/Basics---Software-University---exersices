package exam_16_03_06;

import java.util.Scanner;

/**
 * Created by marmot on 2.5.2017 г..
 */
public class p03_OnTimeExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMin = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMin = Integer.parseInt(scan.nextLine());

        int examTime = examHour * 60 + examMin;
        int arrTime = arriveHour * 60 + arriveMin;

        int differenceTime = examTime - arrTime;
        int diffMin = Math.abs(differenceTime % 60);
        int diffHours = Math.abs(differenceTime / 60);

        if (differenceTime > 30) {
            System.out.println("Early");
            if (differenceTime >= 60) {
                System.out.printf("%d:%02d hours before the start", diffHours, diffMin);
            } else {
                System.out.printf("%d minutes before the start", diffMin);
            }
        } else if (differenceTime <= 30 && differenceTime >= 0) {
            System.out.println("On time");
            if (differenceTime != 0) {
                System.out.printf("%d minutes before the start", diffMin);
            }
        } else {
            System.out.println("Late");
            if (differenceTime <= -60) {
                System.out.printf("%d:%02d hours after the start", diffHours, diffMin);
            } else {
                System.out.printf("%d minutes after the start", diffMin);
            }
        }
    }
}
