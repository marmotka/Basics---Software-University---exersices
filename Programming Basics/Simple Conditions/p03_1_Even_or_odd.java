import java.util.Scanner;

public class p03_1_Even_or_odd {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());

        boolean check = a % 2 == 0;

        if (check) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
    }
}
