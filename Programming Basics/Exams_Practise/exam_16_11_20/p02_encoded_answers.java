package exam_old_16_11_20;

import java.util.Scanner;

public class p02_encoded_answers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        char answers [] = new char [n];
        

        for (int i = 0; i < n; i++) {
            long num = Integer.parseInt(scan.nextLine());
            if (num % 4 == 0) {
                System.out.print("a ");
                countA++;
            } else if (num % 4 == 1) {
                System.out.print("b ");
                countB++;
            } else if (num % 4 == 2) {
                System.out.print("c ");
                countC++;
            } else {
                System.out.print("d ");
                countD++;
            }
        }
        System.out.println();
        System.out.printf("Answer A: %d%n", countA);
        System.out.printf("Answer B: %d%n", countB);
        System.out.printf("Answer C: %d%n", countC);
        System.out.printf("Answer D: %d%n", countD);


    }
}
