package exam_16_07_17;


import java.util.Scanner;

public class p05_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.printf("%s%s%s%n", repeatStr(".", n), repeatStr("*", 3 * n), repeatStr(".", n));
        for (int i = 1; i < n; i++) {
            System.out.printf("%s*%s*%s%n", repeatStr(".", n - i), repeatStr(".", (5 * n - 2 * (n - i + 1))), repeatStr(".", n - i));
        }
        System.out.println(repeatStr("*", 5 * n));
        for (int j = 1; j < 2 * n + 1; j++) {
            System.out.printf("%s*%s*%s%n", repeatStr(".", j), repeatStr(".", (5 * n - 2 * (j + 1))), repeatStr(".", j));
        }
        System.out.printf("%s*%s*%s%n", repeatStr(".", 2 * n + 1), repeatStr("*", ( n - 4)), repeatStr(".", 2 * n + 1));

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
