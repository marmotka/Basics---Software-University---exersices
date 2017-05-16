package exam_16_08_28;


import java.util.Scanner;

public class p05_axe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int dashLeft = 3 * n;
        int dashRight = 2 * n - 2;
        int midSlash=0;
        String sym = "-";

        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s*%s%n", print(sym, dashLeft),
                    print(sym, midSlash),
                    print(sym, dashRight));
            dashRight--;
            midSlash++;
        }
        midSlash --;
        dashRight++;
        for (int i = 0; i <((int)n/2) ; i++) {

            System.out.printf("%s*%s*%s%n", print("*", dashLeft),
                    print(sym, midSlash),
                    print(sym, dashRight));
        }
        for (int i = 0; i <(n/2-1) ; i++) {
            System.out.printf("%s*%s*%s%n", print(sym, dashLeft),
                    print(sym, midSlash),
                    print(sym, dashRight));
            dashLeft--;
            midSlash+=2;
            dashRight--;
        }
        System.out.printf("%s%s%s", print(sym, dashLeft), print("*",(5*n-dashLeft-dashRight)), print(sym,dashRight));


    }

    private static String print(String element, int count) {
        String text = new String(new char[count]).replace("\0", element);
        return text;
    }
}
