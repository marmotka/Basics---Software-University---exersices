package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/8/2017.
 */
public class p08_SunGlasses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.print(repeatStr("*", n * 2));
        System.out.print(repeatStr(" ", n));
        System.out.print(repeatStr("*", n * 2));
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.printf("*%s*", repeatStr("/", 2 * n - 2));
            if ((((n - 1) / 2) - 1) == i) {
                System.out.print(repeatStr("|", n));
            } else {
                System.out.print(repeatStr(" ", n));
            }
            System.out.printf("*%s*%n", repeatStr("/", 2 * n - 2));

        }

        System.out.print(repeatStr("*", n * 2));
        System.out.print(repeatStr(" ", n));
        System.out.print(repeatStr("*", n * 2));
    }

    static String repeatStr(String symbol, int count) {
        String text = "";

        for (int j = 0; j < count; j++) {
            text = text + symbol;
        }
        return text;

    }
}
