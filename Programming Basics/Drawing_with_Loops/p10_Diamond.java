package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/8/2017.
 */
public class p10_Diamond {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String slash = "-";
        String star = "*";
        int slashSideCount = (n - 2) / 2;
        int slashMidCount = 0;

        if (n <= 2) {
            System.out.println(repeatStr(star, n));
        } else {
            if (n % 2 == 0) {
                for (int i = 0; i < n / 2; i++) {
                    System.out.printf("%s*%s*%s%n", repeatStr(slash, slashSideCount),
                            repeatStr(slash, slashMidCount),
                            repeatStr(slash, slashSideCount));
                    slashSideCount--;
                    slashMidCount += 2;

                }
                slashSideCount += 2;
                slashMidCount -= 4;

                for (int i = 0; i <= (n - 1) / 2 - 1; i++) {
                    System.out.printf("%s*%s*%s%n", repeatStr(slash, slashSideCount),
                            repeatStr(slash, slashMidCount),
                            repeatStr(slash, slashSideCount));
                    slashSideCount++;
                    slashMidCount -= 2;
                }
            } else {
                slashSideCount = (n - 1) / 2;
                slashMidCount = 1;
                System.out.printf("%s*%s%n", repeatStr(slash, slashSideCount), repeatStr(slash, slashSideCount));
                slashSideCount--;

                for (int i = 0; i < (n - 1) / 2; i++) {
                    System.out.printf("%s*%s*%s%n", repeatStr(slash, slashSideCount),
                            repeatStr(slash, slashMidCount),
                            repeatStr(slash, slashSideCount));
                    slashSideCount--;
                    slashMidCount += 2;
                }
                slashSideCount+=2;
                slashMidCount -= 4;
                for (int i = 1; i <n-((n - 1) / 2)-1 ; i++) {
                    System.out.printf("%s*%s*%s%n", repeatStr(slash, slashSideCount),
                            repeatStr(slash, slashMidCount),
                            repeatStr(slash, slashSideCount));
                    slashSideCount++;
                    slashMidCount -= 2;
                }
                System.out.printf("%s*%s%n", repeatStr(slash, slashSideCount), repeatStr(slash, slashSideCount));
            }
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
