package date_17_04_22_Complex_Loops;

        import java.util.Scanner;


public class p05_2k_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = Integer.parseInt(scan.nextLine());
            int num = 1;

            for (int i = 1; i <= n; i=i*2+1) {
                System.out.println(i);

            }
        }
}
