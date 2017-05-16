package date_17_04_22_Complex_Loops;

        import java.util.Scanner;

public class p09_sum_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = n; i > 0; i = i / 10) {
            sum = sum + (i % 10);
        }
        System.out.println(sum);

    }
}
