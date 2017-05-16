package exam_16_04_24;

import java.util.Scanner;

public class p05_Stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int dots = n + 1;
        int dash = 2 * n + 1;
        System.out.printf("%s%s%s%n", repeatStr(".",dots),
                                      repeatStr("_",dash),
                                      repeatStr(".", dots));
        dots --;
        dash-=2;

        for (int i = 0; i <n ; i++) {
            System.out.printf("%s//%s\\\\%s%n", repeatStr(".",dots),
                    repeatStr("_",dash),
                    repeatStr(".", dots));
            dots--;
            dash+=2;
       }
       dash -=5;
        System.out.printf("//%sSTOP!%s\\\\%n", repeatStr("_",dash/2),
                repeatStr("_",dash/2));

        dots=0;
        dash = 4*n-1;
        for (int i = 0; i < n; i++) {
            System.out.printf("%s\\\\%s//%s%n", repeatStr(".",dots),
                    repeatStr("_",dash),
                    repeatStr(".", dots));
            dots ++;
            dash -=2;


        }
    }




    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
