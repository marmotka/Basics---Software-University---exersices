package exam_16_12_18;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedBeginning = Integer.parseInt(scan.nextLine());
        double firstTime = Double.parseDouble(scan.nextLine());
        double secondTime = Double.parseDouble(scan.nextLine());
        double thirdTime = Double.parseDouble(scan.nextLine());

        firstTime /= 60.0;
        secondTime /= 60.0;
        thirdTime  /= 60.0;
        double secondSpeed = 1.1*speedBeginning;
        double distance = speedBeginning*firstTime + secondSpeed*secondTime + secondSpeed*0.95*thirdTime;
        System.out.printf("%.2f",distance);
    }
}
