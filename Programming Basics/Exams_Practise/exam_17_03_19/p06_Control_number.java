package exam_17_03_19;

import java.util.Scanner;

public class p06_Control_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int control = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int loopCount = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                sum = sum + (i * 2 + j * 3);
                loopCount++;

                if (sum >= control) {
                    System.out.printf("%d moves%n", loopCount);
                    System.out.printf("Score: %d >= %d", sum, control);
//                    break;
                    return;
                }
            }
//            if (sum >= control) {
//                break;
//            }
        }
        if (sum < control) {
            System.out.printf("%d moves", loopCount);
        }

    }
}
