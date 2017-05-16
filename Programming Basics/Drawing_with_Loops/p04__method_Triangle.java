package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/8/2017.
 */
public class p04__method_Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("$ ",i));
        }
    }

    static String repeatStr(String symbol, int count) {
        String text = "";

        for (int j = 0;j <count; j++) {
            text = text + symbol;
        }
        return text;
    }
}
