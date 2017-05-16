package EXAM_2017_05_07;

import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int special = Integer.parseInt(scan.nextLine());
        int control = Integer.parseInt(scan.nextLine());

        int intervalBegin = m * 100 + n * 10 + l;
        for (int i = intervalBegin; i >= 111; i--) {
            if (i % 3 == 0) {
                special += 5;
                if (special >=control){
                    System.out.printf("Yes! Control number was reached! Current special number is %d.", special);
                    return;
                }
            } else if (i % 10 == 5) {
                special -= 2;
                if (special >=control){
                    System.out.printf("Yes! Control number was reached! Current special number is %d.", special);
                    return;
                }
            } else if (i % 2 == 0) {
                special *= 2;
                if (special >=control){
                    System.out.printf("Yes! Control number was reached! Current special number is %d.", special);
                    return;
                }
            }

        }
        System.out.printf("No! %d is the last reached special number.", special);

    }
}
