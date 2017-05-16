package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/8/2017.
 */
public class p11_Fortress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int slashCount = 0;
        int spaceCount = 0;
        if (n < 5) {
            slashCount = 0;
            spaceCount = 2 * n - 2;
        } else {
            if (n % 2 == 0) {
                slashCount = n - 4;
                spaceCount = 2 * n - 2;
            } else if (n % 2 == 1) {
                slashCount = 2*n - ((n/2+2)*2);
                spaceCount = 2 * n - 2;
            }
        }

        System.out.printf("/%s\\%s/%s\\%n", repeatStr("^", n / 2),
                repeatStr("_", slashCount),
                repeatStr("^", n / 2));

        for (int i = 0; i < n - 3; i++) {
            System.out.printf("|%s|%n", repeatStr(" ", spaceCount));

        }
        System.out.printf("|%s%s%s|%n", repeatStr(" ", (n / 2 + 1)),
                repeatStr("_", slashCount),
                repeatStr(" ", n / 2 + 1));

        System.out.printf("\\%s/%s\\%s/%n", repeatStr("_", n / 2),
                repeatStr(" ", slashCount),
                repeatStr("_", n / 2));
    }

    static String repeatStr(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;
    }
}
