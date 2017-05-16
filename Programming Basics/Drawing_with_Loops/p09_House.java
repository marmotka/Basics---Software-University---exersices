package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/8/2017.
 */
public class p09_House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int initialStars = 1;
        int baseHeight = n / 2;
        int roofHeight = n - n / 2;
        int sideDashCount = (n-initialStars)/2;
        String dash = "-";
        String star = "*";

        if (n % 2 == 0) {
            initialStars++;
        }

        for (int i = 0; i <roofHeight ; i++) {
            System.out.printf("%s%s%s%n",repeatStr(dash,sideDashCount),
                                         repeatStr(star,initialStars),
                                         repeatStr(dash,sideDashCount));
            sideDashCount--;
            initialStars+=2;
        }
        for (int i = 0; i <baseHeight ; i++) {
            System.out.printf("|%s|%n", repeatStr(star,n-2));
        }
    }

    static String repeatStr(String symbol, int count) {
        String text = "";

        for (int j = 0; j < count; j++) {
            text = text + symbol;
        }
        return text;

    }
}
