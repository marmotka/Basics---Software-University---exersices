package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;


public class p012_Butterfly {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String star = "*";
        String dash = "-";

        int countAllEll = n - 2;

        if (n == 3) {
            System.out.println("*\\ /*");
            System.out.println("  @  ");
            System.out.println("*/ \\*");
        } else {
            String sym="";
            for (int i = 1; i <= countAllEll; i++) {
                if (i % 2 == 0) {
                    sym = dash;
                } else {
                    sym = star;
                }
                System.out.printf("%s\\ /%s%n", repeatStr(sym, countAllEll),
                        repeatStr(sym, countAllEll));
            }
            System.out.printf("%s@%n", repeatStr(" ", countAllEll+1));
            for (int i = 1; i <= countAllEll; i++) {
                if (i % 2 == 0) {
                    sym = dash;
                } else {
                    sym = star;
                }
                System.out.printf("%s/ \\%s%n", repeatStr(sym, countAllEll),
                        repeatStr(sym, countAllEll));
            }
        }
    }


    static String repeatStr(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;

    }
}
