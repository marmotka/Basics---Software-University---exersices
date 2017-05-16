package exam_16_11_20_morning;


import java.util.Scanner;

public class p05_Fox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int stars = 1;
        int slash = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s\\%s/%s%n", printsymbols("*", stars),
                    printsymbols("-", slash),
                    printsymbols("*", stars));
            stars++;
            slash -= 2;
        }
        int starsSide = (n - 1) / 2;
        int starsMiddle = n;
        for (int i = 0; i < (n/3); i++) {
            System.out.printf("|%s\\%s/%s|%n", printsymbols("*", starsSide),
                    printsymbols("*", starsMiddle),
                    printsymbols("*", starsSide));
            starsSide++;
            starsMiddle -= 2;
        }
        slash=1;
        int starsMiddleDown = 2*n-1;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s\\%s/%s%n", printsymbols("-",slash),
                                            printsymbols("*",starsMiddleDown),
                                            printsymbols("-",slash));
            slash++;
            starsMiddleDown -=2;
        }
    }

    static String printsymbols(String strTorepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strTorepeat;
        }
        return text;
    }
}
