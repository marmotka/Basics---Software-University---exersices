package exam_16_03_06;

import java.util.Scanner;

public class p05_Draw_Fort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int exponent = n / 2;
        int underlines = 0;
        if (n > 4) {
            underlines = 2 * n - (n / 2) * 2 - 4;
        }

        System.out.printf("/%s\\%s/%s\\%n", print("^", exponent), print("_", underlines), print("^", exponent));
        for (int i = 0; i < (n - 3); i++) {
            System.out.printf("|%s|%n", print(" ", (2 * n - 2)));
        }
        int empty = (2 * n - 2 - underlines) / 2;
        System.out.printf("|%s%s%s|%n", print(" ", empty), print("_", underlines), print(" ", empty));

        System.out.printf("\\%s/%s\\%s/", print("_", exponent), print(" ", underlines), print("_", exponent));

    }

    static String print(String strToPrint, int count) {
        String txt = "";
        for (int i = 0; i < count; i++) {
            txt += strToPrint;
        }
        return txt;
    }
}
