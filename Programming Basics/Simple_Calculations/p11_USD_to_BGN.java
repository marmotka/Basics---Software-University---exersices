import java.util.Scanner;


public class p11_USD_to_BGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double usd = Double.parseDouble(console.nextLine());
        double bgn = usd * 1.79549;
        System.out.printf("%.2f", bgn);
    }
}
