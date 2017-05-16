package exam_16_11_20_evening;


import java.util.Scanner;

public class p06_Max_Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beg = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int maxCombinations = Integer.parseInt(scan.nextLine());

        int counter = 0;
        for (int i = beg; i <= end; i++) {
            for (int j = beg; j <= end; j++) {
                if (counter < maxCombinations) {
                    System.out.printf("<%d-%d>", i, j);
                    counter++;

                }
            }
        }

    }
}
