import java.util.Scanner;

public class p17_Transport_Price {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean time = "day".equals(scanner.nextLine());

        double prTa;
        double prBus = 0.09 * n;
        double prTr = 0.06 * n;

        if (time) {
            prTa = 0.7 + 0.79 * n;
        } else {
            prTa = 0.7 + 0.9 * n;
        }

        if (n >= 100) {
            System.out.printf("%.2f", Math.min(Math.min(prTa, prBus), prTr));
        } else if (n >= 20) {
            System.out.printf("%.2f", Math.min(prTa, prBus));
        } else {
            System.out.printf("%.2f", prTa);
        }


    }
}
