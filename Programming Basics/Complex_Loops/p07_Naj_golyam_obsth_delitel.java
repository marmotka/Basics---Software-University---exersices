package date_17_04_22_Complex_Loops;

        import java.util.Scanner;

public class p07_Naj_golyam_obsth_delitel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Math.min(a, b);
        int gcd=1;

        for (int i = c; i >0; i--) {
            if (b%i==0 && a%i==0){
                System.out.println(i);
                break;
 }

        }
    }
}
