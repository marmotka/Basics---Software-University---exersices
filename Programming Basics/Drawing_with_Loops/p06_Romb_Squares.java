package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/8/2017.
 */
public class p06_Romb_Squares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
            System.out.print(repeatStr(" ", n - i ));
            System.out.println(repeatStr("* ", i));
        }

        for (int i = n-1; i >= 1; i--) {

            System.out.print(repeatStr(" ", n - i ));
            System.out.println(repeatStr("* ", i));
        }
        System.out.println();
    }

    static String repeatStr(String symbol, int count) {
        String text = "";

        for (int j = 0; j < count; j++) {
            text = text + symbol;
        }
        return text;
    }
}
