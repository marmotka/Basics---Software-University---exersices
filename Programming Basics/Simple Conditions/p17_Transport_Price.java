import java.util.Scanner;

public class p17_Transport_Price_OK {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double prTa;
        double prBus = 0.09 * n;
        double prTr = 0.06 * n;


        if (n >= 100) {
            System.out.printf("%.2f", prTr);
        } else if (n >= 20) {
            System.out.printf("%.2f", prBus);
        } else {
            if (time.equals("day")) {
                prTa = 0.7 + 0.79 * n;
                System.out.printf("%.2f", prTa);
            } else if (time.equals("night")) {
                prTa = 0.7 + 0.9 * n;
                System.out.printf("%.2f", prTa);
            }
        }
    }
}
