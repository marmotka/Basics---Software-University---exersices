package exam_16_12_18;


import java.util.Scanner;

public class p05_Chirstmas_Hat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int dotsLeft = 2 * n - 1;
        int slash = 1;

        System.out.printf("%s/|\\%s%n", printSymbols(".", dotsLeft), printSymbols(".", dotsLeft));
        System.out.printf("%s\\|/%s%n", printSymbols(".", dotsLeft), printSymbols(".", dotsLeft));
        for (int i = 0; i < 2 * n; i++) {
            System.out.printf("%s*%s*%s*%s%n", printSymbols(".",dotsLeft),
                                            printSymbols("-",i),
                                            printSymbols("-",i),
                                            printSymbols(".",dotsLeft));
            dotsLeft --;
            slash ++;
        }
        int width = 4*n+1;
        System.out.println( printSymbols("*",width ));
        System.out.printf("*%s%n", printSymbols(".*", width/2));
        System.out.println( printSymbols("*",width ));
    }

    static String printSymbols(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
