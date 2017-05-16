package exam_17_03_18;

import java.util.Scanner;

public class p04_Game_Intervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int run = Integer.parseInt(scan.nextLine());
        int to9 = 0, to19 = 0, to29 = 0, to39 = 0, to50 = 0, invalid = 0;
        double result = 0;

        for (int i = 0; i < run; i++) {
            int numbers = Integer.parseInt(scan.nextLine());
            if (numbers >= 0 && numbers < 10) {
                to9++;
                result += 0.2 * numbers;
            } else if (numbers >= 10 && numbers < 20) {
                to19++;
                result += 0.3 * numbers;
            } else if (numbers >= 20 && numbers < 30) {
                to29++;
                result += 0.4 * numbers;
            } else if (numbers >= 30 && numbers < 40) {
                to39++;
                result += 50;
            } else if (numbers >= 40 && numbers <= 50) {
                to50++;
                result += 100;
            } else {
                invalid++;
                result /= 2;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", to9 * 100.0 / run);
        System.out.printf("From 10 to 19: %.2f%%%n", to19 * 100.0 / run);
        System.out.printf("From 20 to 29: %.2f%%%n", to29 * 100.0 / run);
        System.out.printf("From 30 to 39: %.2f%%%n", to39 * 100.0 / run);
        System.out.printf("From 40 to 50: %.2f%%%n", to50 * 100.0 / run);
        System.out.printf("Invalid numbers: %.2f%%%n", invalid * 100.0 / run);
    }
}
