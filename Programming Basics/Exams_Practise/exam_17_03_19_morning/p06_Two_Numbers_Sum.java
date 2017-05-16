package exam_17_03_19_morning;

import java.util.Scanner;

class p06_Two_Numbers_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magic = Integer.parseInt(scan.nextLine());
        int combination = 0;
        for (int i = begin; i >= end; i--) {
            for (int j = begin; j >= end; j--) {
                combination++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magic);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combination, magic);
    }
}
