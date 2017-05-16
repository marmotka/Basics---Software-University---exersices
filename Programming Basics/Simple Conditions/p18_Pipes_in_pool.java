package date_17_03_18_Simple_Conditions;

import java.text.DecimalFormat;
        import java.util.Scanner;

public class p18_Pipes_in_pool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double fullness = p1 * h + p2 * h;

        double x = fullness * 100 / v;
        double y = p1 * h / fullness * 100;
        double z = p2 * h / fullness * 100;

        if (fullness > v) {
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.printf("For %s hours the pool overflows with %s liters.", df.format(h), df.format (fullness - v));
        } else {
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.",  (int)x,(int)y, (int)z);

        }

    }
}
