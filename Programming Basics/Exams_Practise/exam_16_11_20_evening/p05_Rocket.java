package exam_16_11_20_evening;

import java.util.Scanner;

public class p05_Rocket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int dotsUp = (3 * n - 2) / 2;
        int empty = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%s/%s\\%s%n", printSymbol(".", dotsUp),
                    printSymbol(" ", empty),
                    printSymbol(".", dotsUp));
            dotsUp--;
            empty += 2;
        }
        System.out.printf("%s%s%s%n", printSymbol(".", dotsUp + 1),
                printSymbol("*", empty),
                printSymbol(".", dotsUp + 1));
        for (int i = 0; i < 2 * n; i++) {
            System.out.printf("%s|%s|%s%n", printSymbol(".", dotsUp + 1),
                    printSymbol("\\", empty - 2),
                    printSymbol(".", dotsUp + 1));

        }
        dotsUp = n / 2;
        empty = 2 * n - 2;
        for (int i = 0; i < n / 2; i++) {
            System.out.printf("%s/%s\\%s%n", printSymbol(".", dotsUp),
                    printSymbol("*", empty),
                    printSymbol(".", dotsUp));
            dotsUp--;
            empty += 2;
        }
    }

    private static String printSymbol(String element, int count) {
        String test = new String(new char[count]).replace("\0", element);
        return test;
    }

//    static String printSymbol(String strRepeat, int count) {
//        String text = "";
//        for (int i = 0; i < count; i++) {
//            text = text + strRepeat;
//        }
//        return text;
//}
}
