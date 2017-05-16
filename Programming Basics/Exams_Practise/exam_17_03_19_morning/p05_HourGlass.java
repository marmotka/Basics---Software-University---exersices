package exam_17_03_19_morning;

import java.util.Scanner;

public class p05_HourGlass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.printf("%s%n", printsym("*", 2 * n + 1));
        System.out.printf(".*%s*.%n", printsym(" ", (2 * n - 3)));
        int dotsCount = 2;
        int midSymCount = (2 * n + 1) - 2 * (2 + 1);
        for (int i = 0; i < n - 2; i++) {
            System.out.printf("%s*%s*%s%n", printsym(".", dotsCount), printsym("@", midSymCount), printsym(".", dotsCount));
            dotsCount++;
            midSymCount -= 2;
        }
        System.out.printf("%s*%s%n",printsym(".",(dotsCount)), printsym(".", dotsCount));
        for (int i = 0; i < n-2; i++) {
            System.out.printf("%s*%s@%s*%s%n", printsym(".",dotsCount-1),printsym(" ",i),printsym(" ", i) , printsym(".",dotsCount-1));
            dotsCount--;
        }
        System.out.printf(".*%s*.%n",printsym("@",2*n-3));
        System.out.printf("%s", printsym("*",2*n+1));
    }

    static String printsym(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;
    }

}
