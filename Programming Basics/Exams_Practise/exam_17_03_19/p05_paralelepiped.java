package exam_17_03_19;

import java.util.Scanner;

public class p05_paralelepiped {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int secondDotsCount = 2 * n;

        System.out.printf("+%s+%s%n", repeatStr("~", n - 2), repeatStr(".", (2 * n + 1)));
        for (int i = 0; i <= (2 * n); i++) {

            System.out.printf("|%s\\%s\\%s%n", repeatStr(".", i),
                    repeatStr("~", n - 2),
                    repeatStr(".", secondDotsCount));
            secondDotsCount--;
        }
        secondDotsCount = 2 * n;
        for (int i = 0; i <= 2 * n; i++) {
            System.out.printf("%s\\%s|%s|%n", repeatStr(".", i),
                    repeatStr(".", secondDotsCount),
                    repeatStr("~", n - 2));
            secondDotsCount--;
        }
        System.out.printf("%s+%s+%n", repeatStr(".", (2 * n + 1)), repeatStr("~", n - 2));
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
