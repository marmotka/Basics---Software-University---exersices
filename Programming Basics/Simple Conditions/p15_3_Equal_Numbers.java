import java.util.Scanner;


public class p15_3_Equal_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        boolean fcheck = (a == b);
        boolean scheck = (b == c);

        if (fcheck) {
            if (scheck) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
    }
}

