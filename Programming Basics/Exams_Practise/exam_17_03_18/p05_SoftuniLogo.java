package exam_17_03_18;

import java.util.Scanner;

public class p05_SoftuniLogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int dots = (12 * n - 6) / 2;
        int hashtagUp = 1;

        for (int i = 0; i < 2 * n; i++) {
            System.out.printf("%s%s%s%n", repeatStr(".", dots),
                                        repeatStr("#",hashtagUp),
                                        repeatStr(".",dots));
            dots -=3;
            hashtagUp +=6;
        }
        int dotsLeft =2;
        dots =3;
        hashtagUp -=12;
        for (int i = 0; i <n-2 ; i++) {
            System.out.printf("|%s%s%s%n", repeatStr(".", dotsLeft),
                    repeatStr("#",hashtagUp),
                    repeatStr(".",dots));
            dotsLeft +=3;
            hashtagUp -=6;
            dots +=3;
        }
        for (int i = 0; i <n-1 ; i++) {
            System.out.printf("|%s%s%s%n", repeatStr(".", dotsLeft),
                    repeatStr("#",hashtagUp),
                    repeatStr(".",dots));
        }
        System.out.printf("@%s%s%s%n", repeatStr(".", dotsLeft),
                repeatStr("#",hashtagUp),
                repeatStr(".",dots));
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
