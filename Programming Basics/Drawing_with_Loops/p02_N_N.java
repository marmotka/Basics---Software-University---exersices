package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

public class p02_N_N {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String stars = repeatStr("*", n);
        for (int i = 0; i < n; i++) {
            System.out.println(stars);
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
