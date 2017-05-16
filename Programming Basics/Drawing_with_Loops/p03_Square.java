package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/8/2017.
 */
public class p03_Square {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

         for (int i = 0; i < n; i++) {
             for (int j = 0; j <n ; j++) {
                 System.out.print("* ");
             }
             System.out.println();
        }
    }

//    static String repeatStr(String strToRepeat, int count) {
//        String text = "";
//
//        for (int i = 0; i < count; i++) {
//            text = text + strToRepeat;
//        }
//        return text;
//    }

}
