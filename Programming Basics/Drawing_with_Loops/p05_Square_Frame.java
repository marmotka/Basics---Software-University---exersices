package date_17_04_08_Drawing_with_Loops;
import java.util.Scanner;

public class p05_Square_Frame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String minus = repeatStr("- ", n-2);

      //  System.out.println("+ " + minus + "+" );

      System.out.printf("+ %s+%n" , minus);   // alternativa

        for (int i = 0; i < n-2; i++) {
            System.out.println("| " + minus + "|" );
        }

        System.out.println("+ " + minus + "+" );
    }

    static String repeatStr(String symbol, int count) {
        String text = "";

        for (int j = 0;j <count; j++) {
            text = text + symbol;
        }
        return text;
    }
}
