import java.util.Scanner;

public class p05_Number_to_Text {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        if (n >= 10) {
            System.out.println("number too big");
        } else if (n == 9) {
            System.out.println("nine");
        } else if (n == 8) {
            System.out.println("eight");
        } else if (n == 7) {
            System.out.println("seven");
        } else if (n == 6) {
            System.out.println("six");
        } else if (n == 5) {
            System.out.println("five");
        } else if (n == 4) {
            System.out.println("four");
        } else if (n == 3) {
            System.out.println("three");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 1) {
            System.out.println("one");
        } else System.out.println("null");

    }

}
